package com.igreaper.learning.Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class Student {

    void intro(){
        System.out.println("I'm a student");
    }

    @PostConstruct
    void callThisBeforeAppStarts(){
        System.out.println("Hey, App hasn't started yet");
    }

    @PreDestroy
    void callThisAfterAppEnds(){
        System.out.println("Bye");
    }
}
