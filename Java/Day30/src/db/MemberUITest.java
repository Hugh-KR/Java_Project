package db;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		JFrame f1 = new JFrame();
		f1.setSize(500, 500);
		
		JButton btnNewButton = new JButton("입력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("아이디 입력");
				String name = JOptionPane.showInputDialog("이름 입력");
				String gender = JOptionPane.showInputDialog("성별 입력");
				String tel = JOptionPane.showInputDialog("연락처 입력");
				String email = JOptionPane.showInputDialog("이메일 입력");
				
				MemberDAO dao = new MemberDAO();
				dao.insert(id,name,gender,tel,email);
			}
		});
		f1.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("삭제");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("삭제할 아이디 입력");
				
				MemberDAO dao = new MemberDAO();
				dao.delete(id);
			}
		});
		
		f1.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f1.setVisible(true);
		
		
		
		//String s1 = t1.getText();
		
		
	}

}
