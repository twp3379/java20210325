package p06.textbook.s060803;

public class Car {
<<<<<<< HEAD
	int speed;

	int getSpeed() {
		return speed;
	}

	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			speed = i;
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}
}





=======
	// 필드
	int speed;
	
	// 생성자
	
	// 메소드
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
