package com.springframeworks.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Say Hello - Property";
    }
}
