package db;

import javax.swing.JOptionPane;

public class MemberUITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("아이디 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String gender = JOptionPane.showInputDialog("성별 입력");
		String tel = JOptionPane.showInputDialog("연락처 입력");
		String email = JOptionPane.showInputDialog("이메일 입력");
		
		MemberDAO dao = new MemberDAO();
		dao.insert(id,name,gender,tel,email);
	}

}
