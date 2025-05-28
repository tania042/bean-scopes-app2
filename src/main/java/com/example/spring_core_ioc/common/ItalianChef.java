package com.example.spring_core_ioc.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ItalianChef implements Chef {

    public ItalianChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
            return "Preparare pasta";
    }
}
