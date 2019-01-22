package com.bilgeadam.homework3;

import java.util.concurrent.atomic.AtomicInteger;

public class Plane {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private final int id;
	private String name;
	private PlaneType planeType;
	
	public Plane(String name, PlaneType planeType) {
		id = count.incrementAndGet();
		this.name = name;
		this.planeType = planeType;
	}
	
	public String displayInformation() {
		return "\nPlane id : "+ this.id
				+", Name : "+ this.name
				+" ----> "+ this.planeType.displayInformation();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlaneType getPlaneType() {
		return planeType;
	}

	public void setPlaneType(PlaneType planeType) {
		this.planeType = planeType;
	}

	public  long getId() {
		return this.id;
	}
	
	
}
