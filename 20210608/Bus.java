package com.lnu.experiment5;

class Bus extends Vehicle {
	Bus() {
	}

	Bus(int _maxload) {
		super(_maxload);
	}

	public void run() {
		if (load > super.getMaxLoad()) {
			System.out.println("overload, the bus can't run!");
		} else {
			System.out.println("the bus run!");
		}
	}

	public void addload(int _load) {
		load += _load * 2;
	}
}
