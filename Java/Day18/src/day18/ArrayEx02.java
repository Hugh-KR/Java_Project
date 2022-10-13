package day18;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr = new String[5][2];
		arr[0][0] = "0397134";
		arr[0][1] = "김효진";
		arr[1][0] = "0427134";
		arr[1][1] = "이종협";
		arr[2][0] = "0407134";
		arr[2][1] = "서상춘";
		arr[3][0] = "0317134";
		arr[3][1] = "배영미";
		arr[4][0] = "0337134";
		arr[4][1] = "김예진";

		// 2.학번을 숫자로 변경하기
		int[] s1 = new int[5]; // 학번을 숫자로 변경해서 담다 둘 1차원 배열
		for (int i = 0; i < s1.length; i++) {
			s1[i] = Integer.parseInt(arr[i][0]);

		}
		// 3. 학번이 누가 제일 적은 사람인지 찾기
		// 랭킹 구하는 알고리즘
		int[] s2 = new int[5];
		for (int i = 0; i < s1.length; i++) {
			int cnt = 0;
			for (int j = 0; j < s1.length; j++) {
				if (s1[i] > s1[j]) cnt++;
			}
			s2[i] = cnt;
		}

		
		for(int ss2 : s2) {
			System.out.print(ss2+" ");
		}
		
		// 4. 랭킹의 값을 이용해서 so[][] 배열에 넣기.
		
		String[][] so = new String[5][2];
		for (int i = 0; i < s1.length; i++) {
			so[s2[i]][0] = String.valueOf(s1[i]);
			so[s2[i]][1] = arr[i][1];
		}
		
		System.out.println();
		for (int i = 0; i < so.length; i++) {
			System.out.println(so[i][0] + " " + so[i][1]);
		}
		
		
	}

}
