package p06.textbook.s061004;

public class Car {
	int speed;
<<<<<<< HEAD
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
//		System.out.println(speed);
//		speed = 7;
//		run();
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		Car yourCar = new Car();
		yourCar.speed = 70;
		yourCar.run();
	}
}




=======

	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	public static void main(String[] args) {
//		System.out.println(speed);
//		speed = 7;
//		run();
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		Car yourCar = new Car();
		myCar.speed = 70;
		myCar.run();
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
