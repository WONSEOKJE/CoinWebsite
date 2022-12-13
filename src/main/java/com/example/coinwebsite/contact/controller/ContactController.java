package com.example.coinwebsite.contact.controller;

import com.example.coinwebsite.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class ContactController {

    @Autowired
    ContactService cs;

    @GetMapping("/subscribe")
    public String subscribe1(@RequestParam HashMap<String, String> map) {
        cs.insertSubscribe(map);
        return "redirect:/";
    }

    @PostMapping("/subscribe")
    public String subscribe2(@RequestParam HashMap<String, String> map) {
        cs.insertSubscribe(map);
        String url = map.get("url");
        return "redirect:/" + url;
    }


}
