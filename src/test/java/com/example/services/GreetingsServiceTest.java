package com.example.services;

import org.junit.jupiter.api.Test;
import com.example.services.Greetings;

public class GreetingsServiceTest {

    @Test
    public void greetingsTest(){
        long id = 12;
        String name = "Hisoka";
        Greetings greetings = new Greetings(id,name);
        System.out.println(greetings.getId());
        System.out.println(greetings.getContent());
    }
}
