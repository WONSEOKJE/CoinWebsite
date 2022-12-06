package com.example.coinwebsite.member.service;

import com.example.coinwebsite.member.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class SignupService {

    @Autowired
    SignupRepository sr;

    public int insertSignup(HashMap<String,String> map) {
        return sr.insertSignup(map);
    }

    public ArrayList<HashMap<String,String>> selectLogin(){
        return sr.selectLogin();
    }
}
