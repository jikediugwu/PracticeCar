package com.revature.practicecar.model;

public class FuelTank extends CarPart {

	public enum FuelLevel {
		EMPTY, LOW, HALF, FULL;
	}

	private Enum<FuelLevel> fuel;

	public FuelTank(FuelLevel fuelLevel) {
		this.fuel = fuelLevel;

	}

	@Override
	public void status() {
		System.out.print(super.condition + "% durability, ");
	}

	@Override
	public void function() {
		System.out.print(fuel + " gas tank" + ", ");
	}
}