package com.raunak.app;

import org.springframework.stereotype.Component;

@Component
public class laptop implements computer {
    public void compile(){
        System.out.println("compiling code on laptop");
    }
}