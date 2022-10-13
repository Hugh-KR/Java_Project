package day18;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearchSen(int[] x, int num, int key) {
		// TODO Auto-generated method stub
		int i = 0;
		x[num] = key;
		for(;;){
			if(x[i] == key)
				break;
			i++;
		}
		return i == num ? -1 : i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x  = new int[num+1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값");
		int key = stdIn.nextInt();
		
		int idx = seqSearchSen(x,num, key);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}
	

}
