package p04.textbook;

public class SwitchStringExample {
	public static void main(String[] args) {
		String position = "과장";
<<<<<<< HEAD
		
=======

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
		}
	}
}
