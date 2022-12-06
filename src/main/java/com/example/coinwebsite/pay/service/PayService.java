package com.example.coinwebsite.pay.service;

import com.example.coinwebsite.pay.repository.PayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PayService {

    @Autowired
    PayRepository pr;

    public int insertPoint(HashMap<String,String> map) {
        return pr.insertPoint(map);
    }
}
