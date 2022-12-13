package com.example.coinwebsite.contact.service;

import com.example.coinwebsite.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ContactService {

    @Autowired
    ContactRepository cr;

    public int insertSubscribe(HashMap<String,String> map) {
        return cr.insertSubscribe(map);
    }

    public int insertContact(HashMap<String,String> map) {
        return cr.insertContact(map);
    }
}
