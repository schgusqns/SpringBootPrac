package com.study.springbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //스프링 설정으로 사용됨을 의미
public class Config {
//빈(bean) : Spring이 IOC방식으로 관리하는 객체
	
	@Bean
	public SportsCar Sports() {
		SportsCar Sports=new SportsCar();
		Sports.go();
		return Sports;
	
	}
	
	@Bean(name="hello")
	public Truck truck() {
		Truck truck=new Truck();
		truck.go();
		return truck;
	}

}
