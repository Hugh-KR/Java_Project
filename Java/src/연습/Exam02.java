package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String langth = JOptionPane.showInputDialog("키 입력 ");
		double langth1 = Double.parseDouble(langth);
		
		JOptionPane.showMessageDialog(null, "적정 몸무개 " + (langth1 - 100) * 0.9);
	}

}
