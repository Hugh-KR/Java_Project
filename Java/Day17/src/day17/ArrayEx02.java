package day17;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {

		String[][] arr = new String[5][2];
		arr[0][0] = "0397134";
		arr[0][1] = "김효진";
		arr[1][0] = "0427134";
		arr[1][1] = "모서리";
		arr[2][0] = "0407134";
		arr[2][1] = "원기옥";
		arr[3][0] = "0317134";
		arr[3][1] = "내물병";
		arr[4][0] = "0337134";
		arr[4][1] = "커피커피";

		String[][] arr2 = new String[5][2];

		int min = 10000000;
		int studentId = 0;
		int minIndex;
		for (int i = 0; i < arr2.length; i++) {
			min = 10000000;
			minIndex = 0;
			for (int j = 0; j < arr.length; j++) {
				studentId = Integer.parseInt(arr[j][0]);
				if (min > studentId) {
					min = studentId;
					minIndex = j;
				}
			}
			arr2[i][0] = arr[minIndex][0];
			arr2[i][1] = arr[minIndex][1];
			arr[minIndex][0] = "9999999";
		}
		
		for(String[] arr3 : arr2) {
			for(String v : arr3) {
			System.out.print(v);
			}
			System.out.println();
		}
		
	}

}
