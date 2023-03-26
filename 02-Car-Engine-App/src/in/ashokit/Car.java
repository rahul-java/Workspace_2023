package in.ashokit;

public class Car {

	public void drive() {
		
		Engine eng = new Engine();
		int status = eng.start();

		if (status >= 1) {
			System.out.println("Journey Started...");
		} else {
			System.out.println("Engine Having Some Problem...");
		}
	}
}