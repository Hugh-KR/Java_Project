package day18;

import java.util.Scanner;

public class 보초예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		int idx = 보초메소드(x, num, ky);
		
		if(idx == -1) System.out.println("그 값의 요소가 없습니다");
		else System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}
	
	private static int 보초메소드(int[] x, int num, int key) {
		int i = 0;
		x[num] = key; //2. 찾을 값을 마지막 열에 넣어 준다.
		
		while(true) {
			if(x[i]==key) break; 
			i++;
		}
		return i == num ? -1: i;
	}

}
