package 반복문;

import java.util.Iterator;

public class For문연습2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 33;i <= 222;i++) {
			sum = sum + i;
		}
		System.out.println("1," + sum);
		
		int sum1 = 0;
		for(int i = 55;i<=4500;i=i+2) {
			sum1 = sum1 + i;
		}
		System.out.println("2," + sum1);
		
		int sum2 = 0;
		for(int i = 0;i<=6000;i=i+5) {
			sum2 = sum2 + i;
		}
		System.out.println("3," + sum2);
	}
}
