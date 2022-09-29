package 배열응용;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 3개의 배열을 사용하여 데이터를 넣고, 출력.

		String[] name = { "아버지", "어머니", "형", "나", "동생" };
		int[] age = { 100, 88, 33, 24, 10 };
		double[] len = { 177.5, 152.2, 190.3, 167.7, 155.3 };

		System.out.println("우리집 식구 정리");
		System.out.println("-----------------");
		System.out.println("이름\t나이\t키");
		System.out.println("-----------------");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + age[i] + "\t" + len[i]);
		}

	}

}
