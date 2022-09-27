package 연습;

import javax.swing.JOptionPane;

public class Exam03 {
	public static void main(String[] args) {
		String tel = JOptionPane.showInputDialog("통신사 입력: ");
		String telnum = JOptionPane.showInputDialog("전화번호 입력: ");
		String name = JOptionPane.showInputDialog("가입자이름 입력: ");

		String user = name + "님은 " + tel + "에 " + telnum + "로 가입되셨습니다.";

		JOptionPane.showMessageDialog(null, user);
	}
}