package com.bilgeadam.homework3;

import java.util.Date;

public class Test {

	public static void main(String[] args) {

		Pilot p1 = new Pilot("Yunus", 22, 4, PilotStatus.PRIMARY);
		Pilot p2 = new Pilot("Onur", 35, 6, PilotStatus.SECONDARY);
		
		
		Pilot p3 = new Pilot("Mehmet", 30, 2, PilotStatus.PRIMARY);
		Pilot p4 = new Pilot("Yaren", 28, 4, PilotStatus.SECONDARY);
		
		Plane plane1 = new Plane("Plane 1", PlaneType.SMALLJET);
		Plane plane2 = new Plane("Plane 2", PlaneType.LARGEJET);
		
		Date arrivalDate = new Date();
		Date departureDate = new Date();
		
		
		Flight flight1 = new Flight(
				
				"Amerika", 
				"12:30", 
				departureDate, 
				arrivalDate, 
				p1, p2, 
				plane1, 
				false);
		
		Flight flight2 = new Flight(
				"Ankara", 
				"12:30", 
				departureDate, 
				arrivalDate, 
				p3, p4, 
				plane2, 
				false);
		
		Users u1 = new Users("Yunus", "yunussbilecen", "12345", "1155 7755 7788 9966");
		Users u2 = new Users("Deneme1", "deneme1@gmail.com", "12345", "1155 7755 7788");
		
		
		flight1.addUser(u1);
		flight1.addUser(u2);
		
		flight2.addUser(u1);
		flight1.displayInformation();
		
		System.out.println("------------------------------------------------------");		
		
	}

}
