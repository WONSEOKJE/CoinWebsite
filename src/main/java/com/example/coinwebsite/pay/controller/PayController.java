package com.example.coinwebsite.pay.controller;

import com.example.coinwebsite.pay.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController
public class PayController {

    @Autowired
    PayService ps;

    @GetMapping("/point")
    public String insertPoint(@RequestParam HashMap<String,String> map, HttpSession session) {
        if (session.getAttribute("email") != null) {
            map.put("email",(String) session.getAttribute("email"));
            ps.insertPoint(map);

            return "index";
        }
        else {
            return "pay";
        }
    }

}
