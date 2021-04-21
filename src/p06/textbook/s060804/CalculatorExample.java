package p06.textbook.s060804;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalcu = new Calculator();
<<<<<<< HEAD
		
		double result1 = myCalcu.areaRectangle(10);
		
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
		
=======

		// 정사각형의 넓이 구하기
		
		double result1 = myCalcu.areaRectangle(10);

		// 직사각형의 넓이 구하기

		double result2 = myCalcu.areaRectangle(10, 20);

		// 결과 출력
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
	}
}
