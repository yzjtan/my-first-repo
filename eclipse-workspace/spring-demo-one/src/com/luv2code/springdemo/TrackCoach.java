package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5K";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it:" + fortuneService.getFortune();
	}

}
