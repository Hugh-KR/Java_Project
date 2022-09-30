package 배열응용;

import java.util.Scanner;

public class String연습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("전화번호 입력 >> ");
		String tel = sc.next();
		String tel1 = tel.trim();
		
		String[] tel_sp = tel1.split("-");
		
		if (tel_sp[0].equals("011")) {
			System.out.println("SK");
		} else if (tel_sp[1].equals("019")) {
			System.out.println("LG");
		} else{
			System.out.println("애플");
		}
		
		if (tel_sp[1].length() >= 4) {
			System.out.println("최신폰.");
		}else {
			System.out.println("올드폰.");
		}
		
		int sum = 0;
		for(String x : tel_sp) {
			sum = sum + x.length();
		}
		
		if (sum>=10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지 않은 전화번호.");
		}

	}
}
