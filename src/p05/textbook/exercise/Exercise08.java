package p05.textbook.exercise;

public class Exercise08 {
<<<<<<< HEAD
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		/*
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		*/
		// for each
		for (int[] row : array) {
			for (int n : row) {
				sum += n;
				cnt++;
			}
		}
		
		/*
		int itemNum = 0;
		for (int i = 0; i < array.length; i++) {
			itemNum += array[i].length;
		}
		*/
		
		avg = (double) sum / cnt;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}










=======
public static void main(String[] args) {
	int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
	};
	
	int sum = 0;
	double avg = 0.0;
	int cnt = 0;
	/*
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			sum += array[i][j];
			cnt++;
		}
	}
	*/
	// for each
	for (int[] row : array) {
		for (int n : row) {
			sum += n;
			cnt++;
		}
	}
	
	avg = (double) sum / cnt;
	
	System.out.println("sum : " + sum);
	System.out.println("avg : " + avg);
}
}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
