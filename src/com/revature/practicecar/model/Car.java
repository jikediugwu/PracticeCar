package com.revature.practicecar.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private Engine engine;
	private FuelTank tank;
	private Wheel wheel;

	public Car(Engine engine, FuelTank tank, Wheel wheel) {
		super();
		this.engine = engine;
		this.tank = tank;
		this.wheel = wheel;
	}

	public void run() {

		List<CarPart> carparts = new ArrayList<CarPart>();
		carparts.add(engine);
		carparts.add(tank);
		carparts.add(wheel);

		System.out.print("Car details: ");

		for (int i = 0; i < carparts.size(); i++) {
			carparts.get(i).function();
			//carparts.get(i).status();
		}
		System.out.println();

	}
}