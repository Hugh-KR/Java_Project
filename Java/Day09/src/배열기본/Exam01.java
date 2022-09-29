package 배열기본;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		System.out.println(a.length);
		a[0] = 100;
		System.out.println(a[0]);
		a[4] = 500;
		System.out.println(a[4]);
		a[2] = 200;
		System.out.println(a[2]);
		
		System.out.println();
		
		for(int x : a) {
			System.out.println(x);
		}
		System.out.println();
		
		for(int i=0 ;i<=a.length;i++) {
			System.out.println(i + ": " + a[i]);
		}
	}

}
