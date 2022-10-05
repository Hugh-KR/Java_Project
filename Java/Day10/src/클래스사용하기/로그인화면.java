package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id = "root";
		String pw = "pw";
		
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/shinchanghyeok/Desktop/4학년_2학기/멀티캠퍼스/Java_Project/Java/Day10/짱구.jpeg"));
		lblNewLabel.setBounds(151, 43, 172, 107);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디:");
		lblNewLabel_1.setBounds(105, 191, 61, 16);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호:");
		lblNewLabel_2.setBounds(105, 261, 61, 16);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(250, 186, 130, 26);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(250, 256, 130, 26);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("로그인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				일기쓰기화면 diary = new 일기쓰기화면();
				String t11 = t1.getText();
				String t22 = t2.getText();
				
				if (t11.equals(id) && t22.equals(pw)) {
					JOptionPane.showMessageDialog(f, "로그인 성공!!");
					diary.open();
					f.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패.");
				}
			}
		});
		b1.setBounds(105, 347, 117, 29);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("리셋");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				
			}
		});
		b2.setBounds(279, 347, 117, 29);
		f.getContentPane().add(b2);
		
		
		f.setVisible(true);
	}
}
