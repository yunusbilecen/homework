package com.bilgeadam.homework3;

import java.util.concurrent.atomic.AtomicInteger;

public class Pilot {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private final int id;
	private String name;
	private int age, experienceInYears;
	private PilotStatus pilotStatus;
	
	public Pilot(String name, int age, int experienceInYears, PilotStatus pilotStatus) {
		id = count.incrementAndGet();
		this.name = name;
		this.age = age;
		this.experienceInYears = experienceInYears;
		this.pilotStatus = pilotStatus;
	}

	public String displayInformation () {
		return "id : "+ this.id
				+", Name : "+ this.name
				+", Age : "+ this.age
				+", Experience Year : "+ this.experienceInYears
				+", Pilot Status : "+ this.pilotStatus.name().toString();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperienceInYears() {
		return experienceInYears;
	}

	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}

	public PilotStatus getPilotStatus() {
		return pilotStatus;
	}

	public void setPilotStatus(PilotStatus pilotStatus) {
		this.pilotStatus = pilotStatus;
	}

	public long getId() {
		return id;
	}
	
	
	
}
