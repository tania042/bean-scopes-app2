package com.example.spring_core_ioc.rest;

import com.example.spring_core_ioc.common.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Chef myChef;
    private Chef secondChef;

   // constructor injection
    @Autowired
    public DemoController(@Qualifier("frenchChef") Chef theChef,
                          @Qualifier("frenchChef") Chef theSecondChef) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myChef     = theChef;
        secondChef = theSecondChef;
    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myChef == secondChef, " + (myChef == secondChef);
    }
}
