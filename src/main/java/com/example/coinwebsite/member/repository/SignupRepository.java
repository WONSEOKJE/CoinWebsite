package com.example.coinwebsite.member.repository;

import com.example.coinwebsite.mapper.CoinWebsiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class SignupRepository {
    @Autowired
    CoinWebsiteMapper mapper;

    public int insertSignup(HashMap<String,String> map) {
        return mapper.insertSignup(map);
    }

    public ArrayList<HashMap<String,String>> selectLogin(){
        return mapper.selectLogin();
    }
}
