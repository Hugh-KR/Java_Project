package 조건문;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("당신이 먹고싶은 점심 메뉴는? ");
		String menu = sc.next();
		
		if (menu.equals("짜장면")) {
			System.out.println("중국집");
		}else if (menu.equals("라면")) {
			System.out.println("분식집");
		}else if (menu.equals("회")) {
			System.out.println("횟집");
		}else {
			System.out.println("안먹어요~");
		}
	}

}
