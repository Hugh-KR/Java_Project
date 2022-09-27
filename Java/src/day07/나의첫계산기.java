package day07;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 나의첫계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(82, 66, 61, 16);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(82, 125, 61, 16);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(200, 61, 130, 26);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(200, 120, 130, 26);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton plus = new JButton("+");
		plus.setBackground(Color.RED);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
			String m1 = t1.getText();
			String m2 = t2.getText();
			
			int m11 = Integer.parseInt(m1);
			int m22 = Integer.parseInt(m2);
			JOptionPane.showMessageDialog(f, m11+m22);
			
			
			}
		});
		plus.setBounds(26, 180, 50, 50);
		f.getContentPane().add(plus);
		
		JButton min = new JButton("-");
		min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");
				String m1 = t1.getText();
				String m2 = t2.getText();
				
				int m11 = Integer.parseInt(m1);
				int m22 = Integer.parseInt(m2);
				JOptionPane.showMessageDialog(f, m11-m22);
			}
		});
		min.setBounds(107, 180, 50, 50);
		f.getContentPane().add(min);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "곱하기 버튼을 누르셨군요.");
				String m1 = t1.getText();
				String m2 = t2.getText();
				
				int m11 = Integer.parseInt(m1);
				int m22 = Integer.parseInt(m2);
				JOptionPane.showMessageDialog(f, m11*m22);
			}
		});
		mul.setBounds(193, 180, 50, 50);
		f.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나누기 버튼을 누르셨군요.");
				String m1 = t1.getText();
				String m2 = t2.getText();
				
				int m11 = Integer.parseInt(m1);
				int m22 = Integer.parseInt(m2);
				JOptionPane.showMessageDialog(f, m11/m22);
			}
		});
		div.setBounds(280, 180, 50, 50);
		f.getContentPane().add(div);
		f.setVisible(true);

	}
}
