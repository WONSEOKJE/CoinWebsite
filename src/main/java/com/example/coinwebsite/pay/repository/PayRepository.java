package com.example.coinwebsite.pay.repository;

import com.example.coinwebsite.mapper.CoinWebsiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class PayRepository {

    @Autowired
    CoinWebsiteMapper mapper;

    public int insertPoint(HashMap<String,String> map) {
        return mapper.insertPoint(map);
    }
}
