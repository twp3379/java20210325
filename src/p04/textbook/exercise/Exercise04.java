package p04.textbook.exercise;

public class Exercise04 {
	public static void main(String[] args) {
<<<<<<< HEAD
		int d1 = 0;
		int d2 = 0;

		do {
			
			d1 = (int) (Math.random() * 6) + 1;
			d2 = (int) (Math.random() * 6) + 1;

			System.out.println("(" + d1 + ", " + d2 + ")");
			
		} while ((d1 + d2) != 5);
=======
		int num1 = 0;
		int num2 = 0;

		while (num1 + num2 != 5) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			System.out.println(num1 + ", " + num2);
		}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
	}
}
