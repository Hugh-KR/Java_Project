package 배열응용;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] 작년 = new String[3];
		String[] 올해 = new String[3];

		// 작년에 가고 싶었던 3곳 입력.
		for (int i = 0; i < 작년.length; i++) {
			System.out.print("작년에 가고 싶었던 곳 입력:");
			작년[i] = sc.next();
		}
		
		// 올해에 가고 싶었던 3곳 입력.
		System.out.println();
		for (int i = 0; i < 올해.length; i++) {
			System.out.print("올해에 가고 싶었던 곳 입력:");
			올해[i] = sc.next();
		}
		// 일치하는 항목 확인.
		int count = 0;
		for (int i = 0; i < 올해.length; i++) {
			if (작년[i].equals(올해[i])) {
				count++;
			}
		}
		System.out.println("동일한 곳은 " + count + "곳!!");

	}

}
