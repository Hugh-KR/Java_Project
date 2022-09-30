package 배열응용;

public class 참조형복사 {

	public static void main(String[] args) {
		// 참조형복사(주소가 복사, 얕은 복사)
		int[] n1 = { 100, 200, 300 };
		int[] n3 = n1.clone();
		
		System.out.println("값 변경하기 전 =============");
		for (int x : n1) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		for (int x : n3) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("값 변경한 후 =============");
		n3[0] = 999;
		for (int x : n3) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		for (int x : n1) {
			System.out.print(x + " ");
		}

	}

}
