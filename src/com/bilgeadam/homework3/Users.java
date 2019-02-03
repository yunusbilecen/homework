package com.bilgeadam.homework3;

import java.util.concurrent.atomic.AtomicInteger;

public class Users {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private final int id;
	private String fullName, email, password, eCard;
	private Flight flight;
	
	public Users(String fullName, String email, String password, String eCard) {
		id = count.incrementAndGet();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.eCard = eCard;
	}
	
	@Override
	public String toString() {
		return "User name : " + this.fullName
				+", email : " + this.email;
	}
	
	public Flight getFlight() {
		return flight;
	}

	public void addFlight(Flight f) {
		this.flight = f; 
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String geteCard() {
		return eCard;
	}

	public void seteCard(String eCard) {
		this.eCard = eCard;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
