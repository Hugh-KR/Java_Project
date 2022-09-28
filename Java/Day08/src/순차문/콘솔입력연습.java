package 순차문;

import java.util.Scanner;

public class 콘솔입력연습 {

	public static void main(String[] args) {
		//Scanner를 새롭게 만들어서
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력: ");
		String name = sc.next(); //입력을 받음. String!!
		System.out.println(name);
		
		System.out.print("소속을 입력: ");
		String com = sc.next();
		System.out.println("입력받은 소속은 " + com);
	}

}
