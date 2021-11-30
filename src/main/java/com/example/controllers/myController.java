package com.example.controllers;

import com.example.services.Greetings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class myController {
    public static final String template = "Hello %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greetings myGreeting(@RequestParam(value = "name" , defaultValue = "World") String name){

        return new Greetings(counter.incrementAndGet(),String.format(template,name));

    }
}
