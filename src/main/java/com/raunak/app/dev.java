package com.raunak.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class dev {
    @Autowired
    private laptop lap;
    public void build(){
        lap.compile();  
        System.out.println("working on awesome project");

    }
    
}
