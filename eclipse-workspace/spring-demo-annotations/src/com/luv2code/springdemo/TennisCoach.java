package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/* @Autowired
	public TennisCoach(FortuneService  theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: Do my startup stuff");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: Do my cleanup stuff");
	}
	
	/*
	@Autowired
	public void setFortuneService (FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyFile");
		this.fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hit 100 tennis balls";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
