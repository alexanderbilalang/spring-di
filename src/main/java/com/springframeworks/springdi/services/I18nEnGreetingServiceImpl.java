package com.springframeworks.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nGreetingService")
public class I18nEnGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Say Hello - EN";
    }
}
