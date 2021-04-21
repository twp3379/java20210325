package p05.textbook;

public class AdvancedForExample {
	public static void main(String[] args) {
<<<<<<< HEAD
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
=======
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합= " + sum);

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}
