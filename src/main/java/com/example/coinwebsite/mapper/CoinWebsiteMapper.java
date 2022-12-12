package com.example.coinwebsite.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface CoinWebsiteMapper {
    public int insertSignup(HashMap<String,String> map);
    public ArrayList<HashMap<String,String>> selectLogin();
    public int insertPoint(HashMap<String,String> map);
    public ArrayList<HashMap<String,Object>> selectPointList(String email);
    public ArrayList<HashMap<String,Object>> selectBuyList(String email);
    public int insertBuyCoin(HashMap<String,String> map);
    public ArrayList<HashMap<String,String>> selectCheckBalance(String email);
    public ArrayList<HashMap<String,String>> selectHadBalance(String email);
}
