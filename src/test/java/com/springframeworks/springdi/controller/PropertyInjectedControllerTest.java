package com.springframeworks.springdi.controller;

import com.springframeworks.springdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingServiceImpl();
    }

    @Test
    void testGetGreeting(){
        System.out.println(controller.getGreeting());
    }

}