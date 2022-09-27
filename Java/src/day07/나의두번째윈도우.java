package day07;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class 나의두번째윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		//jframe, 크기정하고, 보여라. ==> windowbuilder로!
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자 1");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(110, 135, 100, 50);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자 2");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(110, 223, 100, 50);
		f.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(222, 149, 130, 26);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 237, 130, 26);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(48, 387, 117, 29);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.setBounds(326, 387, 117, 29);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/shinchanghyeok/Desktop/4학년_2학기/멀티캠퍼스/web-workspace/JavaProject/009.png"));
		lblNewLabel_2.setBounds(0, 6, 494, 84);
		f.getContentPane().add(lblNewLabel_2);
		f.setVisible(true);

	}
}
