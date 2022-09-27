package day07;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
public class Test {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(459, 495);
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("서쪽");
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("동쪽");
		btnNewButton_2.setBackground(new Color(49, 255, 234));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("가운데");
		btnNewButton_3.setBackground(new Color(49, 255, 234));
		btnNewButton_3.setForeground(new Color(49, 255, 234));
		btnNewButton_3.setFont(new Font("Krungthep", Font.PLAIN, 14));
		f.getContentPane().add(btnNewButton_3, BorderLayout.CENTER);
		
		JButton btnNewButton_4 = new JButton("아래");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);
		//dddd
	}
		
}