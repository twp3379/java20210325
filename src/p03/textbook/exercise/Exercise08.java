package p03.textbook.exercise;

public class Exercise08 {
<<<<<<< HEAD
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y; // NaN
		
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과:" + result);
		}
		
	}
=======
public static void main(String[] args) {
	double x = 5.0;
	double y = 0.0;
	
	double z = x % y;
	
	if (Double.isNaN(z)) {
		System.out.println("0.0으로 나눌 수 없습니다.");
	} else {
		double result = z + 10;
		System.out.println("결과:" + result);
	}
}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
