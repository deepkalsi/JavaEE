package com.globomatics.bike.controllers;

import com.globomatics.bike.basic.auth.AuthenticationBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthenticationController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean loginPageBean(){
        return new AuthenticationBean("You are authenticated");
    }
}
