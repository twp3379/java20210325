package p06.textbook.s060901;

public class Car {
<<<<<<< HEAD
	String model;
	int speed;

	Car(String model) {
		this.model = model;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
//			this.setSpeed(100);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}
=======
	// 필드
	String model;
	int speed;
	
	// 생성자
	
	Car(String model){
		this.model = model;
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
