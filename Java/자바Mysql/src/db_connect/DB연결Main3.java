package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DB연결Main3 {

	public static void main(String[] args) throws Exception {
	
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");
		DAO dao = new DAO();
		
		
		MemberVO bag = new MemberVO();
		

		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		

		dao.insert(bag);
	}
}
