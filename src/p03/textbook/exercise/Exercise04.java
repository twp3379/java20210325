package p03.textbook.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
<<<<<<< HEAD
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
=======

		// 학생 한명이 가지는 연필 수
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);

		// 남은 연필수

		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
	}
}
