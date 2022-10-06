package 상속활용;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드사용2 extends JFrame{
	JLabel count, day;
	스레드1 카운터;
	스레드2 시각;
	static 스레드사용2 f;
	public 스레드사용2() {
		setSize(800, 300);
		count = new JLabel();
		day = new JLabel();
		add(count, BorderLayout.WEST);
		add(day, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		스레드1 카운터 = new 스레드1();
		스레드2 시각 = new 스레드2();
		
		카운터.start();
		시각.start();
	}
}
