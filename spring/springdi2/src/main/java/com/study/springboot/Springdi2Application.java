package com.study.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springbean.AsianaTicket;
import com.study.springbean.Config;
import com.study.springbean.KalTicket;

@SpringBootApplication
public class Springdi2Application {
   
	public static void main(String[] args) {
		//SpringApplication.run(Springdi2Application.class, args);
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		AsianaTicket a=(AsianaTicket)context.getBean("a");
		a.ticketing();
		
		KalTicket t=context.getBean("kal",KalTicket.class);
		t.ticketing();
		
	}

}
