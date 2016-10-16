package com.sheharyar.springdemo;

public class TrackCoach implements Coach {

	
	private FortuneService thefortuneService;
	
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		thefortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}


	@Override
	public String getDailyFortune() {
		return "Just Do It: " + thefortuneService.getFortune();
	}

}
