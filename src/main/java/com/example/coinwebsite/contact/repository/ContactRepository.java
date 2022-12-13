package com.example.coinwebsite.contact.repository;

import com.example.coinwebsite.mapper.CoinWebsiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ContactRepository {

    @Autowired
    CoinWebsiteMapper mapper;

    public int insertSubscribe(HashMap<String,String> map) {
        return mapper.insertSubscribe(map);
    }

    public int insertContact(HashMap<String,String> map) {
        return mapper.insertContact(map);
    }
}
