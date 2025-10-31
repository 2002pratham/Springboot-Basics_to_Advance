package com.igreaper.learning.Introduction.Syrup;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class StrawberrySyrup implements syrupType {
    @Override
    public String getSyrupType() {
        return "Syrup for Strawberry Cake";
    }
}
