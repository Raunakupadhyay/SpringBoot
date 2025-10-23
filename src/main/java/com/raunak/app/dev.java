package com.raunak.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class dev {
    @Autowired
    private computer comp;
    public void build(){
        comp.compile();  
        System.out.println("working on awesome project");

    }
    
}
