package com.lnu.experiment5;

public abstract class Vehicle {
	private int maxload;
	protected int load;

	Vehicle() {
		maxload = 0;
		load = 0;
	}

	Vehicle(int _maxload) {
		maxload = _maxload;
		load = 0;
	}

	public void setMaxLoad(int _maxload) {
		maxload = _maxload;
	}

	public int getMaxLoad() {
		return maxload;
	}

	public abstract void run();

	public abstract void addload(int _load);

	public static void main(String args[]) {
		Vehicle v1 = new Car(100); // 隐式塑型
		Vehicle v2 = new Bus(400); // 隐式塑型
		v1.addload(200);
		v2.addload(200);
		v1.run();
		v2.run();
	}
}
