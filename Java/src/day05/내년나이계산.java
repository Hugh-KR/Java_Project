package day05;

import javax.swing.JOptionPane;

public class 내년나이계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age = JOptionPane.showInputDialog("올해 나이 입력");
//		age + 1;
		int age2 = Integer.parseInt(age);
		int age3 = age2 + 1;
		
		JOptionPane.showMessageDialog(null, "내년 나이는 " + age3);
	}

}
