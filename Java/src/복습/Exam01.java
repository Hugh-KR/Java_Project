package 복습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w = JOptionPane.showInputDialog("가로크기");
		
		int width = Integer.parseInt(w);
		
		JOptionPane.showMessageDialog(null, "가로의 길이는 " + w);
	}

}
