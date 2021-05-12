package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartRestEndpoint {

    @Autowired
    private BuildProperties buildProperties;

    @GetMapping("/build")
    public String getBuild() {
        return "This is application version:"+buildProperties.getVersion();
    }
}
