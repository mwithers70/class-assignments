package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//provides hints for Spring that the class plays a specific role. Our class is a web @Controller so Spring considers it when handling incoming web requests
@RestController //handles incoming web request

public class MainController {

    //annotation that provides "routing" info. Tells Spring that any http request with "/"(default) path should be mapped to the home() method.
    @RequestMapping("/")
    //Because of rest controller annotation Spring renders resulting string directly back to the caller. In this case caller is home method and string is returned.
    public String home(){ //home method is the caller
        return "Hello World!";
    }//end of String home



}//end of class MainController
