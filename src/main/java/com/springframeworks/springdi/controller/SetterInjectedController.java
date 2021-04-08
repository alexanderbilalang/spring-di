package com.springframeworks.springdi.controller;

import com.springframeworks.springdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
