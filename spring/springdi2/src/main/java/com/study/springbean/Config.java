package com.study.springbean;

import org.springframework.context.annotation.Bean;

public class Config {

	//AsianaTicket a()
	//KalTicket t() bean name="kal"
	
	@Bean
	public AsianaTicket a() {
		AsianaTicket a=new AsianaTicket();
		
		return a;
	}
	
	@Bean(name="kal")
	public KalTicket t() {
		KalTicket t=new KalTicket();
		
		return t;
	}
	
}
