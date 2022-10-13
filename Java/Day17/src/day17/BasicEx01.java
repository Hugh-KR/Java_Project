package day17;

import java.util.Scanner;

public class BasicEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = null;
		int a, b, c;
		int max = -9999999;
		int mid;
		
		System.out.println("세 정수의 최대값을 구합니다.");
		sc = new Scanner(System.in);
		System.out.print("a의 값" );
		a = sc.nextInt();
		System.out.print("b의 값" );
		b = sc.nextInt();
		System.out.print("c의 값" );
		c = sc.nextInt();
		
		
		if(max < a) max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		
		System.out.println("최대값은" + max + "입니다.");
		
		if(a>=b)
			if(b>=c)
				mid=b;
			else if(a<=c)
				mid = a;
			else
				mid = c;
		else if(a>c)
			mid = a;
		else if(b>c)
			mid = c;
		else
			mid = b;
		System.out.println(mid);
			
	}

}
