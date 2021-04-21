package p04.textbook.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {

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
	}
}
