package com.springframeworks.springdi;

import com.springframeworks.springdi.controller.ConstructorInjectedController;
import com.springframeworks.springdi.controller.MyController;
import com.springframeworks.springdi.controller.PropertyInjectedController;
import com.springframeworks.springdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        System.out.println("------ Primary --------");
        System.out.println(controller.sayHello());

        System.out.println("------ Property --------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------ Setter --------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreetingService());


        System.out.println("------ Constructor --------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
