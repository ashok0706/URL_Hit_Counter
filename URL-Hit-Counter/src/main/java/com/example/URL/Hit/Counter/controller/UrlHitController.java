package com.example.URL.Hit.Counter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
	
    int x = 0;
   
    @GetMapping("/count")
    public String getHitCount() {  	
    	String y = Integer.toString(++x);
    	return y;

    }
}