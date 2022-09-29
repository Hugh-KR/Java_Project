package 배열기본;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a1 = { "제주", "부산", "일본", "싱가폴", "시애틀" };

		for (String s : a1) {
			System.out.print(s + " ");
		}
		System.out.println();
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
		System.out.println();

		char[] a2 = { 'r', 'g', 'p', 'y', 'b' };
		for (char c : a2) {
			System.out.print(c + " ");
		}
		System.out.println();
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
		System.out.println();

		double[] a3 = { 12.3, 23.4, 45.6, 56.7, 67.8 };
		for (double d : a3) {
			System.out.print(d + " ");
		}
		System.out.println();
		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i] + " ");
		}

	}

}
