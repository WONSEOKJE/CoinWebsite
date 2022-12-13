package com.example.coinwebsite.pay.service;

import com.example.coinwebsite.pay.repository.PayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class PayService {

    @Autowired
    PayRepository pr;

    public int insertPoint(HashMap<String,String> map) {
        return pr.insertPoint(map);
    }
    public ArrayList<HashMap<String,Object>> selectPointList(String email) {
        return pr.selectPointList(email);
    }

    public ArrayList<HashMap<String,Object>> selectBuyList(String email) {
        return pr.selectBuyList(email);
    }

    public int insertBuyCoin(HashMap<String,String> map){
        return pr.insertBuyCoin(map);
    }

    public double selectCheckBalance(String email) {
        return pr.selectCheckBalance(email);
    }

    public int selectHadBalance(String email) {
        return pr.selectHadBalance(email);
    }

    public ArrayList<HashMap<String,Object>> selectHavingBalance(String email) {
        return pr.selectHavingBalance(email);
    }

    public  int selectMoneyBalance(String email) {
        return pr.selectMoneyBalance(email);
    }
}
