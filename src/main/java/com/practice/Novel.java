package com.practice;

import org.springframework.stereotype.Component;

@Component
public class Novel implements Book {

    private String type = "novel";
    @Override
    public void bookType() {
        System.out.print("This is" + type);
    }
}
