package com.revature.practicecar.model;

public class Wheel extends CarPart {

	public enum WheelType {
		ALLOY, STEEL, CHROME, FORGED, CAST;
	}

	private Enum<WheelType> type;

	public Wheel(WheelType wheelType) {
		this.type = wheelType;
	}

	@Override
	public void status() {
		System.out.print(super.condition + "% durability, ");
	}

	@Override
	public void function() {
		System.out.print(type + " wheels, ");
	}
}