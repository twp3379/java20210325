package p09.textbook.exercise.ex05;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {
<<<<<<< HEAD
			
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});
	}
=======

			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");

			}
		});
	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
