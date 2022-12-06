package com.example.coinwebsite.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface CoinWebsiteMapper {
    public int insertSignup(HashMap<String,String> map);
    public ArrayList<HashMap<String,String>> selectLogin();
    public int insertPoint(HashMap<String,String> map);
}
