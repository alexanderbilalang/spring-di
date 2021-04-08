package com.springframeworks.springdi.controller;

import com.springframeworks.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
