package p04.lecture;

public class A09For {
	public static void main(String[] args) {
<<<<<<< HEAD
		
		System.out.println("실행문1");
		
		
		// 실행순서:
		// 1번 --> 2번 -true-> 코드블록 --> 3번 --> 2번
		//            -false-> 종료
		
		//   1번      ; 2번  ; 3번
		for (int i = 0; i < 3; i++) {
			// 코드블록
			System.out.println("반복할 코드들...");
		}
		
=======

		System.out.println("실행문1");

		// 실행순서 :
		// 1 --> 2번 -true--> 코드블록 --> 3번 --> 2번
		// -->false --> 종료
		
		// 1번 ; 2 번 ; 3번
		for (int i = 0; i < 3; i++) {
			// 코드 블록
			System.out.println("반복할 코드들...");
		}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
		System.out.println("실행문2");
	}
}
