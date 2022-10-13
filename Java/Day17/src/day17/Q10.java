package day17;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if (n > 0) {
			int origin = n;
			while (n > 0) {
				n /= 10;
				cnt++;
			}
			System.out.println("입력한 숫자는 " + origin);
			System.out.println(cnt + " 자리의 숫자 입니다.");
		} else {
			System.out.println("양의 정수를 입력해 주세요.");
		}
	}

}
