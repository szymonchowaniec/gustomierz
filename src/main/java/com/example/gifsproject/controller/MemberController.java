package com.example.gifsproject.controller;


import com.example.gifsproject.Service.MemberService;
import com.example.gifsproject.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {


    MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/memberadd")
    public ModelAndView showForm(ModelMap modelMap){
        modelMap.addAttribute("member", new Member());

        return new ModelAndView("memberadd", modelMap); //@Controller + dependencies(thymleaf) - View
    }

    @PostMapping("/memberadd")
    public String addBook(@ModelAttribute Member member, ModelMap modelMap){
        memberService.addMember(member);
        modelMap.addAttribute("member", member);
        return "redirect:/showmembers"; //GET
    }

    @GetMapping("/showmember")
    public String showbook(ModelMap modelMap){
        modelMap.addAttribute("member", memberService.getMembers());
        return "showMembers";
    }


}
