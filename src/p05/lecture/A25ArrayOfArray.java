package p05.lecture;

import java.util.Arrays;

public class A25ArrayOfArray {
<<<<<<< HEAD
	// 그림:09.배열의 배열.png
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[1][1] = 9;
		arr[0][2] = 8;
		
=======
	// 그림 : 09.배열의 배열.png
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[1][1] = 9;
		arr[0][2] = 8;

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
		for (int[] elem : arr) {
			System.out.println(Arrays.toString(elem));
		}
	}

}
