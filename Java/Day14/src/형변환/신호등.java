package 형변환;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 신호등 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.black);
		f.setSize(618, 692);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		
		JButton b1 = new JButton("빨강신호");
		b1.setForeground(Color.RED);
		b1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		f.getContentPane().add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("car01.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		
		JButton b2 = new JButton("노란신호");
		b2.setForeground(Color.YELLOW);
		b2.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		f.getContentPane().add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("car02.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		
		JButton b3 = new JButton("파랑신호");
		b3.setForeground(Color.BLUE);
		b3.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		f.getContentPane().add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("car03.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		f.setVisible(true);
	}

}
