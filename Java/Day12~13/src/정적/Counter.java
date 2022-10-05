package 정적;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {
	static int count;
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(300,300);
		f.getContentPane().setLayout(null);
		
		JLabel number = new JLabel("0");
		number.setFont(new Font("Apple Braille", Font.BOLD, 150));
		number.setHorizontalAlignment(SwingConstants.CENTER);
		number.setBounds(77, 74, 150, 150);
		f.getContentPane().add(number);
		
		JButton b1 = new JButton("1 더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (count >= 0) {
					count++;
					number.setText(count + "");
				}
			}
		});
		b1.setBounds(6, 6, 80, 30);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("0으로 초기화");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");
			}
		});
		b2.setBounds(98, 6, 105, 30);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("1 빼기");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count > 0) {
					count--;
					number.setText(count + "");
				}
			}
		});
		b3.setBounds(214, 6, 80, 30);
		f.getContentPane().add(b3);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(number);
		
		f.setVisible(true);
		
	}
}
