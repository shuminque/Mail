package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface VerifyService {
    public void sendVerifyCode(String email);
    public boolean doVerify(String mail,String code);
}
