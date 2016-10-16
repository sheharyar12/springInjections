package com.sheharyar.springdemo;

public class CricketCoach implements Coach {

	private FortuneService thefortuneService;
	
	private String emailAddress;
	private String team;
	
	
	private CricketCoach(){
		System.out.println("CricketCoach : insde no-arg constructor");
	}
	
	/*
	public CricketCoach(FortuneService fortuneService){
		thefortuneService = fortuneService;
	}
	*/
	@Override
	public String getDailyWorkout() {
		return "Practices fast bowling for 15min";
	}

	@Override
	public String getDailyFortune() {
		return thefortuneService.getFortune();
	}

	//Setter methods
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("CricketCoach : insde setter method");
		this.thefortuneService = thefortuneService;
	}

	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
}
