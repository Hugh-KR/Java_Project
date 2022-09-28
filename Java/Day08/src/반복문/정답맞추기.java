package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random r = new Random();
//		int target = r.nextInt(100);
		int target = 88;
		int count = 0;
		int no = 0;
		while (true) { //무한루프
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			count = count+1;
			int data2 = Integer.parseInt(data);
			if (data2 == target) {
				System.out.println("정답은 " + target);
				System.out.println("전체시도 횟수 " + count);
				System.out.println("오답 횟수 " + no);
				System.exit(0);
			} else {
				System.out.println("오답");
				no++;
				if (data2 > target) {
					System.out.println("너무 커요.");
				}else {
					System.out.println("너무 작아요.");
				}
			
			}
			JOptionPane.showMessageDialog(null, "다음에 또 방문해주세요.");
		}
		
	}

}
