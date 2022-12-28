package com.study.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springbean.Config;
import com.study.springbean.SportsCar;
import com.study.springbean.Truck;

@SpringBootApplication
public class Springdi0Application {

	public static void main(String[] args) {
		//SpringApplication.run(Springdi0Application.class, args);
		
		//1. IoC컨테이너 생성
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		SportsCar Sports=(SportsCar)context.getBean("Sports");
		Sports.go();
		
		Truck truck=context.getBean("hello", Truck.class);
		truck.go();
		
	}

}
