package com.two.practice;

import com.practice.Book;
import org.springframework.stereotype.Component;

@Component
public class Poem implements Book {
    private String type ="poem";

    @Override
    public void bookType() {
        System.out.print("This is" + type);
    }
}
