package p06.textbook.s061401;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
<<<<<<< HEAD

		myCar.setSpeed(-50);

		System.out.println("현재 속도: " + myCar.getSpeed());

		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeed());

		if (!myCar.isStop()) {
			myCar.setStop(true);
		}

		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}




=======
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + myCar.getSpeed() );
		
		// 올바른 속도 변경
		
		myCar.setSpeed(60);
		
		// 멈춤
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
