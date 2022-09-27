package day07;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Properties {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t4;
	private static JTextField t3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500,600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setBounds(72, 57, 130, 21);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(235, 51, 130, 29);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton b1 = new JButton("어디로 갈까?");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String m = t1.getText();
				if (m.equals("아메리카노")||m.equals("아이스 아메리카노")||m.equals("홍차")) {
					JOptionPane.showMessageDialog(f, "카페 가세요.");
				}else {
					JOptionPane.showMessageDialog(f, "물 드세요.");
				}
			}
		});
		
		b1.setBounds(72, 105, 293, 29);
		f.getContentPane().add(b1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(235, 174, 130, 29);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setBounds(72, 180, 130, 21);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton b2 = new JButton("나의 내년 나이는?");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String m1 = t2.getText();
				int m11 = Integer.parseInt(m1);
				JOptionPane.showMessageDialog(f, m11+1);
				
			}
		});
		b2.setBounds(72, 228, 293, 29);
		f.getContentPane().add(b2);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(235, 312, 130, 29);
		f.getContentPane().add(t4);
		
		JLabel lblNewLabel_2 = new JLabel("수학 점수");
		lblNewLabel_2.setBounds(72, 318, 130, 21);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton b3 = new JButton("두 과목 점수의 평균은?");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String m2 = t3.getText();
				String m3 = t4.getText();
				int m22 = Integer.parseInt(m2);
				int m33 = Integer.parseInt(m3);
				double avr = (m22+m33)/2;
				JOptionPane.showMessageDialog(f, avr);
			}
		});
		b3.setBounds(72, 366, 293, 29);
		f.getContentPane().add(b3);
		
		JLabel lblNewLabel_2_1 = new JLabel("국어 점수");
		lblNewLabel_2_1.setBounds(72, 283, 130, 21);
		f.getContentPane().add(lblNewLabel_2_1);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(235, 277, 130, 29);
		f.getContentPane().add(t3);
		f.setVisible(true);
	}

}
