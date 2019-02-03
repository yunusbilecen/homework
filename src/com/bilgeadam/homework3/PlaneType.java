package com.bilgeadam.homework3;

public enum PlaneType {
	
	SMALLJET(1, 3000),
	LARGEJET(3, 4000),
	CARGO(5, 5000);
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
