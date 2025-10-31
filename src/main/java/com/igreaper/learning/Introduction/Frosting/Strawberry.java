package com.igreaper.learning.Introduction.Frosting;

import org.springframework.stereotype.Component;

@Component
public class Strawberry implements frostType{
    @Override
    public String getFrostingType() {
        return "Frosting for Strawberry Cake";
    }
}

