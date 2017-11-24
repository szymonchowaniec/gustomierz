package com.example.gifsproject.controller;


import com.example.gifsproject.Service.MemberService;
import com.example.gifsproject.model.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MemberController {

    private static final Logger LOG = LoggerFactory.getLogger(MemberController.class);


    MemberService memberService;

    Member member = new Member();

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public ModelAndView showForm(ModelMap modelMap){

        modelMap.addAttribute("member",  member);
        LOG.info("Add new member");

        return new ModelAndView("addMember", modelMap); //@Controller + dependencies(thymleaf) - View
    }

    @PostMapping("/")
    public String addMember(@ModelAttribute Member member, ModelMap modelMap){
       // memberService.addMember(member);
        modelMap.addAttribute("member", member);
        return "redirect:/answer"; //GET
    }

    @GetMapping("/answer")
    public String showbook(ModelMap modelMap){
        return "answernowy";
    }


    @PostMapping ("/answer/add")
    public String addAnswer(@RequestParam("answer")String answer, ModelMap modelMap){
        memberService.addAnswer(member,answer);
        memberService.addMember(member);
        LOG.info("Add answer" + answer);
        modelMap.addAttribute("member", member);
        return "answernowy"; //GET
    }
//
//    @PostMapping("/answer")
//    public String addAnswer(@RequestParam ("answer") String answer, ModelMap modelMap){
//        memberService.addAnswer(member,answer);
//        modelMap.addAttribute("answer", answer);
//        memberService.addMember(member);
//        System.out.println(member);
//        return "redirect:/answernowy"; //GET
//    }








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
