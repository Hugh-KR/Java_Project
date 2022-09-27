package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String width = JOptionPane.showInputDialog("가로길이 입력 ");
		String height = JOptionPane.showInputDialog("세로길이 입력 ");
		int width1 = Integer.parseInt(width);
		int height1 = Integer.parseInt(height);
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은 " + width1 * height1);
	}

}
