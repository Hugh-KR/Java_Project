package 반복문;

import java.util.Scanner;

public class 인기투표프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iu = 0;
		int you = 0;
		int bts = 0;
		
		int count = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("입력 1)아이유 2)유재석 3)방탄 4)종료>> ");
			count++;
			int choice = sc.nextInt();
			
			if (choice == 4) {
				System.out.println("전체 투표 횟수 " + count);
				System.out.println("아이유 " + iu);
				System.out.println("유재석 " + you);
				System.out.println("방탄 " + bts);
				break;
			}
			
			if (choice == 1) {
				iu++;
			} else if (choice == 2) {
				you++;
			} else if (choice == 3) {
				bts++;
			} else {
				System.out.println("없는 번호입니다.");
			} 
		}
	}

}
