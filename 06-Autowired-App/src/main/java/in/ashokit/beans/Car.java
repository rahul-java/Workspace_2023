package in.ashokit.beans;

public class Car {

	private DieselEngine dieselEng;

	public void setDieselEng(DieselEngine dieselEng) {
		System.out.println("setDieselEng() method executed...");
		this.dieselEng = dieselEng;
	}

	public Car() {
		System.out.println("Car:: 0-Param Constructor");
	}

	public Car(DieselEngine dieselEng) {
		System.out.println("Car:: Param Constructor");
		this.dieselEng = dieselEng;
	}

	public void drive() {
		int start = dieselEng.start();
		if (start >= 1) {
			System.out.println("Journey Started...");
		} else {
			System.out.println("Engine Failed To Start...!!");
		}
	}
}
