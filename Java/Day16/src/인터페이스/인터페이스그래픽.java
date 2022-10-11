package 인터페이스;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class 인터페이스그래픽 implements ActionListener{
	static JTextArea list;
	static JButton b1,b2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(new FlowLayout());

		b1 = new JButton("나를 눌러요.");
		f.getContentPane().add(b1);

		b2 = new JButton("나도 눌러요.");
		f.getContentPane().add(b2);

		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);

		인터페이스그래픽 버튼처리 = new 인터페이스그래픽();
		b1.addActionListener(버튼처리);
		b2.addActionListener(버튼처리);

		list = new JTextArea(5, 10);
		list.setFont(font);
		f.add(list);

		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			list.append("b1버튼을 클릭함" + "\n");
			System.out.println("하핳.");
		}
		if (e.getSource() == b2) {
			list.append("b2버튼을 클릭함" + "\n");
			System.out.println("하하하핳ㅎ핳.");
		}
	}

}
