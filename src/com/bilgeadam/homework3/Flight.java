package com.bilgeadam.homework3;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Flight {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private final int id;
	private String destination, departure;
	private Date arrivalTime,departureTime;
	private Pilot[] pilots;
	private Plane plane;
	private boolean cancelled;
	
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
				+", Cancelled : " + cancelled);
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
