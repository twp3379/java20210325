package p04.textbook;

public class IfNestedExample {
	public static void main(String[] args) {
<<<<<<< HEAD
		int score = (int) (Math.random() * 20) + 81; // 81이상 100이하
		System.out.println("점수:" + score);
		
		String grade;
		
		if (score >= 90) {
			// A
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			// B
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점:" + grade);
	}
}





=======
		int score = (int) (Math.random() * 20) + 81;
		System.out.println("점수:" + score);

		String grade;

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점:" + grade);
	}
}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
