package com.revature.practicecar.model;

import com.revature.practicecar.functionalinterfaces.CarParts;

public abstract class CarPart implements CarParts {

	protected int condition;

	public CarPart() {
		this.condition = 100;
	}

	public void status() {
		System.out.println(condition);
	}

	@Override
	public void function() {
		System.out.println(condition);
	}
}