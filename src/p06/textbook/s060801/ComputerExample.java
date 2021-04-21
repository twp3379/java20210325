package p06.textbook.s060801;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();

		int[] values1 = { 1, 2, 3 };
		int result1 = myCom.sum1(values1);
<<<<<<< HEAD
		System.out.println("result1: " + result1);
		
//		myCom.sum1(1, 2, 3);

		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result2: " + result2);
		
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
		
		myCom.sum2(new int[] {1, 2, 3});
	}
}




=======
		System.out.println("result1 : " + result1);

		int reuslt2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result2 : " + reuslt2);

		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3 : " + result3);

		int reuslt4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4 : " + reuslt4);
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
