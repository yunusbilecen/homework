package com.bilgeadam.homework3;

public enum PlaneType {
	
	SMALLJET(10, 3000),
	LARGEJET(20, 4000),
	CARGO(30, 5000);
	int capacity,range;
	
	private PlaneType(int capacity, int range) {
		this.capacity = capacity;
		this.range = range;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getRange() {
		return range;
	}
	
	public String displayInformation() {
		
		return "Plane Type : "+this.name()
			   +", Capacity : "+ this.capacity
			   +", Range : "+ this.range + " Miles";
	}
	
}
