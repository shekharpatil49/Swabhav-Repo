package com.techlab.vehicle.test;

import com.techlab.vehicle.Bike;
import com.techlab.vehicle.Car;
import com.techlab.vehicle.IMovable;
import com.techlab.vehicle.Truck;

public class TestVehicle {

	public static void main(String args[]) {

		IMovable vehicle[] = new IMovable[3];
		
		vehicle[0] = new Bike();
		vehicle[1] = new Truck();
		vehicle[2] = new Car();

		startRace(vehicle);

	}

	private static void startRace(IMovable[] vehicle) {

		System.out.println("Race is started");
		for (IMovable vehicles : vehicle) {
			vehicles.move();
		}
		System.out.println("Race is ended");
	}

}
