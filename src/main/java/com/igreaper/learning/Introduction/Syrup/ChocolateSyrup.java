package com.igreaper.learning.Introduction.Syrup;

import org.springframework.stereotype.Component;

@Component
public class ChocolateSyrup implements syrupType {
    @Override
    public String getSyrupType() {
        return "Syrup for Chocolate Cake";
    }
}
