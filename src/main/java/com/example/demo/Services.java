package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Services {

    private MyNewClass myNewClass;

    @Autowired
    public void injectDependencies(@Qualifier("mySecondClass") MyNewClass myNewClass) {
        this.myNewClass = myNewClass;
    }

    public String tellAStory() {
        return "The dependency is saying: " + myNewClass.sayHello();
    }
}
