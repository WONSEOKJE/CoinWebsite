package com.example.coinwebsite.member.controller;

import com.example.coinwebsite.member.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    SignupService ss;

    @PostMapping("/signup")
    public String insertSignup(@RequestParam HashMap<String,String> map) {
        ss.insertSignup(map);
        return "index";
    }

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String,String> map, HttpSession session) {

        for (HashMap<String,String> mem : ss.selectLogin()) {
            if (map.get("email").equals(mem.get("email")) && map.get("password").equals(mem.get("password"))) {
                // 가입된 회원인 경우
                session.setAttribute("email", mem.get("email"));
                return "index";
            }
        }

        return "login";
    }

}
