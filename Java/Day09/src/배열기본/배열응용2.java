package 배열기본;

import java.util.Scanner;

public class 배열응용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] a1 = new String[3];

		for (int i = 0; i < a1.length; i++) {
			System.out.print("글자 입력 >> ");
			a1[i] = sc.next();
		}

		System.out.println(a1[0] + " 보다는 " + a1[1]);
	}

}
