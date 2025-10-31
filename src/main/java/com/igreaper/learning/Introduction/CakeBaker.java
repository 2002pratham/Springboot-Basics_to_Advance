package com.igreaper.learning.Introduction;

import com.igreaper.learning.Introduction.Frosting.frostType;
import com.igreaper.learning.Introduction.Syrup.syrupType;
import org.springframework.stereotype.Component;


@Component
public class CakeBaker {

    private final frostType frost;
    private final syrupType syrup;

    public CakeBaker(frostType frost, syrupType syrup){
        this.frost = frost;
        this.syrup=syrup;
    }

    public String BakeCake(){
        return (frost.getFrostingType() + syrup.getSyrupType());
    }

}
