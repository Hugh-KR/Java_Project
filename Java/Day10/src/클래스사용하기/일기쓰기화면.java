package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기쓰기화면 {
	//멤버변수
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	//멤버메서
	public void open() {
		// TODO Auto-generated method stub
		JFrame f1 = new JFrame();
		f1.setSize(500,500);
		f1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setBounds(85, 68, 61, 16);
		f1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setBounds(85, 111, 61, 16);
		f1.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setBounds(85, 263, 61, 16);
		f1.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(232, 63, 130, 26);
		f1.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(232, 106, 130, 26);
		f1.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(232, 198, 130, 140);
		f1.getContentPane().add(t3);
		
		JButton b1 = new JButton("파일에 일기 저장");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				String t33 = t3.getText();
				
				try {
					// file.txt 자바프로그램간 스트림(강물, 연결통로)를 만들어라!
					FileWriter file = new FileWriter(t11 + ".txt");
					
					// 스트림을 통해서 데이터를 보내라.
					file.write(t11 + "\n");
					file.write(t22 + "\n");
					file.write(t33 + "\n");
					
					// 스트림이 닫힐 때 데이터를 다 보냈다고 인식함.
					file.close();
					} catch (Exception r) {
						System.out.println("파일에 저장 중 에러발생함.!!!");
					}
				JOptionPane.showMessageDialog(f1, "일기 저장완료.");
			}
		});
		b1.setBounds(85, 385, 277, 39);
		f1.getContentPane().add(b1);
		
		
		f1.setVisible(true);
	}

}
