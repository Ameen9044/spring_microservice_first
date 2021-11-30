package com.example.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsServiceTest {

    @Test
    public void greetingsTest(){
        long id = 123;
        long id_expected = 123;
        String name = "Hisoka";
        Greetings greetings = new Greetings(id,name);
        assertEquals(id_expected,greetings.getId());

    }
}
