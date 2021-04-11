package com.springframeworks.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Say Hello - Setter";
    }
}
