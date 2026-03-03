package com.kdu.app.services;

import org.springframework.stereotype.Service;

@Service
public class AppService {
    
    public String getAppVersion() {
        return "0.1.1";
    }
}