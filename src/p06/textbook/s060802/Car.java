package p06.textbook.s060802;

public class Car {
<<<<<<< HEAD
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		} 
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				return;
			}
		}
	}
=======
	// 필드
	int gas;

	// 생성자

	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false를 리턴
		}
		System.out.println("가스가 있습니다.");
		return true; // ture를 리턴
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; // 메소드 실행 종료
			}
		}
	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
