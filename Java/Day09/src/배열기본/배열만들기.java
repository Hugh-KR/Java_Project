package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = { 1, 2, 3, 4, 5, 6, 7 };
		
		System.out.println(s[2]);
		System.out.println(s[5]);
		
		int[] s2 = new int[5];
		
		s2[s2.length - 1] = 500;
		
		System.out.println(s2);
	}

}
