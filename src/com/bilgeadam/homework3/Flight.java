package com.bilgeadam.homework3;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Flight {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private final int id;
	private String destination, departure;
	private Date arrivalTime,departureTime;
	private Pilot[] pilots;
	private Plane plane;
	private boolean cancelled;
	private ArrayList<Users> users;
	private static int userCount;
	private Scanner scan = new Scanner(System.in);
	
	public Flight(String destination, String departure, Date departureTime, Date arrivalTime,  Pilot pilot1, Pilot pilot2,
			Plane plane, boolean cancelled) {
		id = count.incrementAndGet();
		pilots = new Pilot[2];
		this.destination = destination;
		this.departure = departure;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.pilots[0] = pilot1;
		this.pilots[1] = pilot2;
		this.plane = plane;
		this.cancelled = cancelled;
		this.users = new ArrayList<Users>();
		this.userCount = 0;
	} 
	
	public void addUser(Users u) {
		if(this.getPlane().getPlaneType().getCapacity() > userCount) {
			if(u.getFlight() != null) {
				System.out.println("User has a flight. Would you like to change flight. Yes or No");
				String result = scan.next();
				System.out.println(result);
				if(result.equals("Yes") || result.equals("yes")) {
					u.getFlight().removeUser(u);
					userAdded(u);
				}else if(result == "No" || result == "no") {
					System.out.println("User still has old flight. Thanks!!");
				}else {
					System.out.println("Your writing is wrong !!");
				}
			}
			userAdded(u);
		}else {
			System.err.println("Flight "+this.id+" is full!!");
		}
	}
	
	private void userAdded(Users u) {
		users.add(u);
		u.addFlight(this);
		userCount++;
	}
	
	public void removeUser(Users u) {
		users.remove(u);
	}
	public void displayInformation() {
		System.out.println("Flight id : "+ this.id
				+", Destination : "+ this.destination
				+", Departure : "+ this.departure
				+", Departure Time : " + this.departureTime
				+", Arrival Time : "+ this.arrivalTime
				+", \nPilot 1 " + pilots[0].displayInformation()
				+", \nPilot 2 " + pilots[1].displayInformation()
				+", "+ plane.displayInformation()
				+", Cancelled : " + cancelled 
				+", ");
		if(users.size() != 0) {
			for (Users user : users) {
				if(user != null) {
					System.out.println(user.toString());
				}
			}
		}
		
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Pilot[] getPilots() {
		return pilots;
	}

	public void setPilots(Pilot[] pilots) {
		this.pilots = pilots;
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public  long getId() {
		return this.id;
	}
	
	
}
