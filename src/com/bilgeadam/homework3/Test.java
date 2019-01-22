package com.bilgeadam.homework3;

import java.util.Date;

public class Test {

	public static void main(String[] args) {

		Pilot p1 = new Pilot("Yunus", 22, 4, PilotStatus.PRIMARY);
		Pilot p2 = new Pilot("Onur", 35, 6, PilotStatus.SECONDARY);
		
		
		Pilot p3 = new Pilot("Mehmet", 30, 2, PilotStatus.PRIMARY);
		Pilot p4 = new Pilot("Yaren", 28, 4, PilotStatus.SECONDARY);
		
		Plane plane1 = new Plane("Plane 1", PlaneType.SMALLJET);
		Plane plane2 = new Plane("Plane 2", PlaneType.SMALLJET);
		
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
		flight1.displayInformation();
		System.out.println("------------------------------------------------------");
		flight2.displayInformation();
		
	}

}
