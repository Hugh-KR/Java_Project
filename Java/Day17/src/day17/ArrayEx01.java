package day17;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa = new int[10];
		int n = 100;
		System.out.print("1) ");
		for (int i = 0; i < aa.length; i++) {
			aa[i] = n;
			n += 100;
			System.out.print(aa[i] + " ");
		}
		System.out.println();
		System.out.println();
		
//		for(int m : aa) {
//			System.out.print(m + " ");
//		}
		
		System.out.println("2번문제---------------------");
		int[][] b = new int[2][3];
		int[] sum = new int[2];
		
		int number = 100;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = number;
				sum[i] += b[i][j];
				number -= 5;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + "\t");
				
			}
			System.out.println("|" +sum[i]);
			System.out.println();
		}
		
		for(int[] bb : b) {
			for(int bbb : bb) {
				System.out.print(bbb + " ");
			}
			System.out.println("|" +sum[0]);
			System.out.println();
	}
		System.out.println();
		System.out.println("3번문제---------------------");
		
		String[][][] c = { {{"a","b"},{"c","d"},{"e","f"}},
				{{"f","g"},{"h","i"},{"j","k"}} };
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int j2 = 0; j2 < c[i][j].length; j2++) {
					System.out.print(c[i][j][j2] + " ");
				}
			}
		}
		
		System.out.println();
		
		for(String[][] cc : c) {
			for(String[] ccc : cc) {
				for(String cccc : ccc) {
					System.out.print(cccc + " ");
				}
			}
		}

		
		
		
		
	}

}
