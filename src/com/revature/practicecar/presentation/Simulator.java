package com.revature.practicecar.presentation;

import com.revature.practicecar.model.Car;
import com.revature.practicecar.model.Engine;
import com.revature.practicecar.model.FuelTank;
import com.revature.practicecar.model.FuelTank.FuelLevel;
import com.revature.practicecar.model.Wheel;
import com.revature.practicecar.model.Wheel.WheelType;


public class Simulator {

	public static void main(String[] args) {

		Car honda = new Car(new Engine(6), new FuelTank(FuelLevel.LOW), new Wheel(WheelType.ALLOY));
		honda.run();

		Car toyota = new Car(new Engine(4), new FuelTank(FuelLevel.FULL), new Wheel(WheelType.STEEL));
		toyota.run();

	}
}