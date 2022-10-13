package day18;

public class 선형검색예제01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 6, 4, 3, 2, 1, 8 };
		int key = 8; // 검색할 키값
		
		boolean flag = false;
		
		for (int i = 0 ; i < a.length; i++) {
			if(a[i] == key) {flag=true; System.out.println("찾았다."); break;}
		}
		if(!flag) System.out.println("못 찾았다.");
	}

}
