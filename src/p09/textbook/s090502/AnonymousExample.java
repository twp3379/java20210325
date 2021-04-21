package p09.textbook.s090502;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
<<<<<<< HEAD
		
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}
		});
	}
=======
		// 익명 객체 필드 사용
		anony.field.turnOn();
        // 익명 객체 로컬 변수 사용
		anony.method1();
        // 익명 객체 매개값 사용
		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다");

			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다");

			}
		});

	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
