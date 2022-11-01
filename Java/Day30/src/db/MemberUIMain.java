package db;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUIMain {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JButton b4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1 = new JFrame();

		f1.setSize(300, 400);
		f1.getContentPane().setLayout(null);

		t1 = new JTextField();
		t1.setBounds(79, 66, 130, 26);
		f1.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBounds(79, 104, 130, 26);
		f1.getContentPane().add(t2);
		t2.setColumns(10);

		t3 = new JTextField();
		t3.setBounds(79, 142, 130, 26);
		f1.getContentPane().add(t3);
		t3.setColumns(10);

		t4 = new JTextField();
		t4.setBounds(79, 180, 130, 26);
		f1.getContentPane().add(t4);
		t4.setColumns(10);

		t5 = new JTextField();
		t5.setBounds(79, 218, 130, 26);
		f1.getContentPane().add(t5);
		t5.setColumns(10);

		
		
		JButton b1 = new JButton("작성");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String name = t2.getText();
				String gender = t3.getText();
				String tel = t4.getText();
				String email = t5.getText();

				MemberDAO dao = new MemberDAO();
				dao.insert(id, name, gender, tel, email);
			}
		});
		b1.setBounds(92, 256, 117, 29);
		f1.getContentPane().add(b1);

		JButton b2 = new JButton("삭제");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				dao.delete(id);
			}
		});
		b2.setBounds(92, 288, 117, 29);
		f1.getContentPane().add(b2);

		JButton b3 = new JButton("수정");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String name = t2.getText();
				String gender = t3.getText();
				String tel = t4.getText();
				String email = t5.getText();
				
				MemberDAO dao = new MemberDAO();
				dao.update(id, name, gender, tel, email);
			}
		});
		b3.setBounds(92, 319, 117, 29);
		f1.getContentPane().add(b3);
		
		b4 = new JButton("검색");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				
				MemberDAO dao = new MemberDAO();
				dao.select(id);
			}
		});
		b4.setBounds(6, 288, 66, 29);
		f1.getContentPane().add(b4);
		f1.setVisible(true);
	}
}
