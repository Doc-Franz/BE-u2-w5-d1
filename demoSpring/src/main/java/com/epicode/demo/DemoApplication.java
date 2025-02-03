package com.epicode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// creazione di un application context a cui devo dire quale bean utilizzare
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MenuConfig.class);

		Menu menu = (Menu) appContext.getBean("menu");
		menu.printMenu();

		// chiudo il contesto
		appContext.close();
	}

}
