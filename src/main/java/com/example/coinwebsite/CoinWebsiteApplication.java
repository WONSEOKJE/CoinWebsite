package com.example.coinwebsite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.coinwebsite.mapper"})
public class CoinWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinWebsiteApplication.class, args);
    }

}
