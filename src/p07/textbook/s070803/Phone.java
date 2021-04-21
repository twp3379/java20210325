package p07.textbook.s070803;

public abstract class Phone {
<<<<<<< HEAD
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
=======
	// 필드
	public String owner;

	// 생성자

	public Phone(String owner) {
		this.owner = owner;
	}

	// 메소드

	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
