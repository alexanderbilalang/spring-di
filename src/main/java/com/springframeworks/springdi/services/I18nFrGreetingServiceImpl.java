package com.springframeworks.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FR")
@Service("i18nGreetingService")
public class I18nFrGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Say Hello - FR";
    }
}
