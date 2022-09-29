package 배열기본;

import java.util.Scanner;

public class 배열응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로 입력하는 부품을 ram에 가져다 놓음.
		Scanner	sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i = 0;i < 5; i++) {
			System.out.print("숫자입력>> ");
			num[i] = sc.nextInt();
		}
		int sum = num[0] + num[2];
		
		System.out.println("첫번째와 세번째의 합은 " + sum);
	}

}
