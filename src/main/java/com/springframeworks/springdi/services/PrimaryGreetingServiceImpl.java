package com.springframeworks.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Say Hello - From Primary Bean";
    }
}