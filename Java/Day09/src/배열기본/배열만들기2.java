package 배열기본;

public class 배열만들기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		
		// 출력용
		for (int x : num) {
			System.out.println(x);
			
		}
		
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		

	}

}
