package com.kdu.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kdu.app.services.AppService;

@RestController
@RequestMapping("/api/app")
public class AppController {
    
    private final AppService appService;

    public AppController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping("/version")
    public String getAppVersion() {
        return appService.getAppVersion();
    }
}
