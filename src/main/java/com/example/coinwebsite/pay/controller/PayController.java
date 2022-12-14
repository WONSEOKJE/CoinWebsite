package com.example.coinwebsite.pay.controller;

import com.example.coinwebsite.pay.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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

    @GetMapping("/pointList")
    public ArrayList<HashMap<String,Object>> selectPointList(HttpSession session) {
        ArrayList<HashMap<String,Object>> pointlist = null;
        if (session.getAttribute("email") != null) {
            pointlist = ps.selectPointList(String.valueOf(session.getAttribute("email")));
        }
        return pointlist;
    }

    @GetMapping("/buyList")
    public ArrayList<HashMap<String,Object>> selectBuyList(HttpSession session) {
        ArrayList<HashMap<String,Object>> buylist = null;
        if (session.getAttribute("email") != null) {
            buylist = ps.selectBuyList(String.valueOf(session.getAttribute("email")));
        }
        return buylist;
    }

    @GetMapping("/hadBalance")
    public int selectHadBalance(HttpSession session) {
        if (session.getAttribute("email") != null) {
            String email = String.valueOf(session.getAttribute("email"));
            return ps.selectHadBalance(email);
        }
        return 0;
    }

    @GetMapping("/havingBalance")
    public ArrayList<HashMap<String,Object>> selectHavingBalance(HttpSession session) {
        if (session.getAttribute("email") != null) {
            String email = String.valueOf(session.getAttribute("email"));
            return ps.selectHavingBalance(email);
        }
        return null;
    }
    @GetMapping("/moneyBalance")
    public int selectMoneyBalance(HttpSession session) {
        if (session.getAttribute("email") != null) {
            String email = String.valueOf(session.getAttribute("email"));
            return ps.selectMoneyBalance(email);
        }
        return 0;
    }
    @GetMapping("/checkBalance")
    public String selectCheckBalance (@RequestParam double total, HttpSession session) {
        if (session.getAttribute("email") == null) {
            return "login";
        }
        String email = String.valueOf(session.getAttribute("email"));
        double money = ps.selectCheckBalance(email);
        System.out.println("money = " + money);

        if (money > total) {
            return "can";
        }

        return "cannot";
    }

    @PostMapping("/buyCoin")
    public String insertBuyCoin(@RequestParam HashMap<String,String> map, HttpSession session) {

        if (session.getAttribute("email") != null) {
            map.put("email",String.valueOf(session.getAttribute("email")));
            ps.insertBuyCoin(map);
            return "history";
        }
        return "market";
    }



}
