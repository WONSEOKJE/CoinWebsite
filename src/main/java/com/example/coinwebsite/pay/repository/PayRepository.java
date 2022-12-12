package com.example.coinwebsite.pay.repository;

import com.example.coinwebsite.mapper.CoinWebsiteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class PayRepository {

    @Autowired
    CoinWebsiteMapper mapper;

    public int insertPoint(HashMap<String,String> map) {
        return mapper.insertPoint(map);
    }
    public ArrayList<HashMap<String,Object>> selectPointList(String email) {
        return mapper.selectPointList(email);
    }

    public ArrayList<HashMap<String,Object>> selectBuyList(String email) {
        return mapper.selectBuyList(email);
    }

    public int insertBuyCoin(HashMap<String,String> map){
        return mapper.insertBuyCoin(map);
    }

    public ArrayList<HashMap<String,String>> selectCheckBalance(String email) {
        return mapper.selectCheckBalance(email);
    }

    public ArrayList<HashMap<String,String>> selectHadBalance(String email) {
        return mapper.selectHadBalance(email);
    }
}
