package com.lnu.experiment5;

class Car extends Vehicle {
	Car() {
	}

	Car(int _maxload) {
		super(_maxload);
	}

	public void run() {
		if (load > super.getMaxLoad()) {
			System.out.println("overload, the car can't run!");
		} else {
			System.out.println("the car run!");
		}
	}

	public void addload(int _load) {
		load += _load;
	}
}