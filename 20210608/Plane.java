package com.lnu.experiment5;

public class Plane extends Vehicle implements Fly {
	private boolean bfly = false;

	Plane(int maxload) {
		super(maxload);
	}

	public void addload(int _load) {
		load += _load;
	}

	public void run() {
		fly();
	}

	public void fly() {
		if (bfly)
			System.out.println("the plane is flying");
		else
			System.out.println("the plane park now");
	}

	public void land() {
		if (bfly)
			System.out.println("the plane is landing");
		else
			System.out.println("the plane park now");
		bfly = false;
	}

	public void takeoff() {
		if (load > super.getMaxLoad()) {
			System.out.println("the plane can't takeoff");
			bfly = false;
		} else {
			System.out.println("the plane takeoff");
			bfly = true;
		}
	}

	public static void main(String args[]) {
		Plane v1 = new Plane(100);
		Plane v2 = new Plane(400);
		v1.addload(200);
		v2.addload(200);
		v1.takeoff();
		v1.run();
		v1.land();
		v2.takeoff();
		v2.run();
		v2.land();
	}
}
