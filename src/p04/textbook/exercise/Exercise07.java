package p04.textbook.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
<<<<<<< HEAD
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("------------------------");
			System.out.print("선택>");
			int choose = scanner.nextInt();

			switch (choose) {
			case 1:
				// 예금
				System.out.print("예금액>");
				int input = scanner.nextInt();
				balance += input;
				break;

			case 2:
				// 출금
				System.out.print("출금액>");
				int output = scanner.nextInt();
				balance -= output;
				break;

			case 3:
				// 잔고
				System.out.println("잔고>" + balance);
				break;

			case 4:
				// 종료
				run = false;
				break;
			}
		}
		
		scanner.close();
		System.out.println("프로그램 종료");

=======

		boolean run = true;

		int balance = 0;
		int select = 0;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------");
			System.out.print("선택> ");

			select = scan.nextInt();

			if(select == 1) {
				System.out.println("예금액> ");
				balance += scan.nextInt();
			} else if (select == 2) {
				System.out.println("출금액>");
				balance -= scan.nextInt();
			} else if (select == 3) {
				System.out.println("잔고> " + balance);
				
			} else {
				run = false;
			}
		
		}
		System.out.println("프로그램 종료");
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
	}
}
