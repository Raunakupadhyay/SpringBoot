package com.raunak.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements computer {
    public void compile(){
        System.out.println("compiling code  but faster");
    }
}