package p06.textbook.s060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
<<<<<<< HEAD
		
		
//		System.out.println(myCar.gas);
		myCar.setGas(5);
//		System.out.println(myCar.gas);
		
		boolean gasState = myCar.isLeftGas();
		
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if (myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
=======

		myCar.setGas(5); // car의 setGas()메소드 호출

		boolean gasState = myCar.isLeftGas(); // car의 isLeftGas() 메소드 호출
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // Car의 run() 메소드 호출
		}

		if (myCar.isLeftGas()) { // car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}

	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
