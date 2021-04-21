package p06.textbook.s060705;

public class Car {
<<<<<<< HEAD
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car() {

	}

	Car(String model) {
		this(model, "은색", 250);
	}

	Car(String model, String color) {
		this(model, color, 250);
		System.out.println("string string int");
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}





=======
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;

	// 생성자
	Car() {

	}

	Car(String model) {
		this(model, "은색", 250);
	}

	Car(String model, String color) {
		this(model, color, 250);
	}

	Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
