package com.example.spring_core_ioc.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TurkeyChef implements Chef {

    public TurkeyChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Rahat Lucum";
    }
}
