package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Service
public class MyNewClass {
    private String myVar;

    public MyNewClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return "Hello guys, my vars = " + myVar;
    }
}
