package com.igreaper.learning.Introduction.Frosting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Chocolate implements frostType{
    @Override
    public String getFrostingType() {
        return "Frosting for Chocolate Cake";
    }
}

