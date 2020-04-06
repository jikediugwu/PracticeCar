package com.revature.practicecar.model;

public class Engine extends CarPart {

	private int cylinders;

	public Engine(int cylinders) {
		this.cylinders = cylinders;
	}

	@Override
	public void status() {
		System.out.print(super.condition + "% durability, ");
	}

	@Override
	public void function() {
		System.out.print(cylinders + "-cylinders" + ", ");
	}
}