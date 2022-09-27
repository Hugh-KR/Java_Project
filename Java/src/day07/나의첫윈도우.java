package day07;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class 나의첫윈도우 {
	private static JTextField textField;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. jframe 부품을 만들어주자
		JFrame f = new JFrame();
		
//		2. 새로 만든 부품의 크기를 결정
		f.setSize(500,500);
		
		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setFont(new Font("Kohinoor Devanagari", Font.PLAIN, 13));
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("/Users/shinchanghyeok/Desktop/4학년_2학기/멀티캠퍼스/web-workspace/JavaProject/009.png"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
//		3. 새로 만든 부품 "보여주세요?
		f.setVisible(true);
		
	}

}
