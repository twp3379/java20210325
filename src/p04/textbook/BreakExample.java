package p04.textbook;

public class BreakExample {
	public static void main(String[] args) {
<<<<<<< HEAD
		
		for (;true;) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}
=======

		for (; true;) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
