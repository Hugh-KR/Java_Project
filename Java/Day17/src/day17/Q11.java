package day17;

import java.util.Iterator;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%3s", "|");
		for (int i = 1; i < 10; i++)
			System.out.printf("%3d", i);
		System.out.println();
		System.out.println("--+---------------------------");
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%2d", i);
			System.out.printf("%1s", "|");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
		
		double x1,x2, a=10.0, b=13.0, c=12.0;
		
		x1 = -b + Math.sqrt(Math.abs(b*b - 4*a*c)) / 2*a;
		x2 = -b - Math.sqrt(Math.abs(b*b - 4*a*c)) / 2*a;
		
		System.out.println(x1);
		System.out.println(x2);
	}

}
