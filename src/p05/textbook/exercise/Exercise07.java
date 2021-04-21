package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
<<<<<<< HEAD
		
		int[] array = {-11, -15, -13, -18, -12};
		// 최대값
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		// 최소값
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		// 합계
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		// 평균
		double avg = sum / (double) array.length;
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}




=======
		int sum = 0;
		double avg = 0;

		int[] array = { 1, 5, 3, 8, 2 };
		// 최대값
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		// 최소값
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		// 합계
		for (int i = 0; i < 5; i++) {
			sum += array[i];
		}
		// 평균

		avg = (double) sum / array.length;

		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avg);
	}
}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
