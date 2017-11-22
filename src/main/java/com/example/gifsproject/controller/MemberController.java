package com.example.gifsproject.controller;


import com.example.gifsproject.Service.MemberService;
import com.example.gifsproject.model.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MemberController {

    private static final Logger LOG = LoggerFactory.getLogger(MemberController.class);


    MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public ModelAndView showForm(ModelMap modelMap){
        modelMap.addAttribute("member", new Member());
        LOG.info("Add new member");

        return new ModelAndView("addMember", modelMap); //@Controller + dependencies(thymleaf) - View
    }

    @PostMapping("/")
    public String addBook(@ModelAttribute Member member, ModelMap modelMap){
        memberService.addMember(member);
        modelMap.addAttribute("member", member);
        return "redirect:/showmembers"; //GET
    }

    @GetMapping("/showmembers")
    public String showbook(ModelMap modelMap){
        modelMap.addAttribute("member", memberService.getMembers());
        return "answers";
    }








//szukajki
//    @GetMapping("/")
//    public String showGifs(@RequestParam(required = false) String q, ModelMap modelMap){
//
//        LOG.info("user is showing gifs with q={}", q);
//
//        List<Gif> gifs = getAndFIlterGifs(q);
//        LOG.info("Found gifs={}", gifs);
//        modelMap.addAttribute("gifs", gifs);
//        return "nowa";
//    }
//
//    private List<Gif> getAndFIlterGifs(String q) {
//        List<Gif> gifs;
//        if (q != null) { //should be in service
//            List<Gif> filteredGifs = new ArrayList<>();
//            for (Gif gif : gifRepository.getAllGifs()) {
//                if (gif.getName().contains(q)) {
//                    filteredGifs.add(gif);
//                }
//            }
//            gifs = filteredGifs;
//        }else {
//            gifs = gifRepository.getAllGifs();
//        }
//        return gifs;
//    }


}
