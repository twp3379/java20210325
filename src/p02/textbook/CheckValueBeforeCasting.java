package p02.textbook;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
<<<<<<< HEAD
		
		if ( (i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
=======

		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}
