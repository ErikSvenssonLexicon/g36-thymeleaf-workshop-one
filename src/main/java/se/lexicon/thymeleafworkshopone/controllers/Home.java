package se.lexicon.thymeleafworkshopone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {

    private final List<String> strings = new ArrayList<>();

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("strings",strings);
        return "contact";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @PostMapping("/contact/add")
    public String process(@RequestParam(name = "string") String input){
        strings.add(input);
        return "redirect:/contact";
    }

}
