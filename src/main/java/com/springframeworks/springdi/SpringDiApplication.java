package com.springframeworks.springdi;

import com.springframeworks.springdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		MyController controller =  (MyController) ctx.getBean("myController");
		String greeting = controller.sayHello();
		System.out.println(greeting);
	}

}
