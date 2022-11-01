package mainView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AccessDB {
	
	public static int insert(String id, String name, String gender, String tel, String email) {
		
		PreparedStatement ps = null;
		int rresult = 1;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.드라이버 설정 성공");
			
			String url = "jdbc:mysql://localhost:3306/member";
			String user = "abcd";
			String password = "12345678";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2.db연결 성공");
			
			String sql = "insert into userInformation values (?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, gender);
			ps.setString(4, tel);
			ps.setString(5, email);
			System.out.println("3.SQL문 객체 성공");
			
			ps.executeUpdate();
		
		}
		catch(Exception e) {
			e.printStackTrace();
			rresult = 0;
		}finally {
			try {
				if(ps!=null && !ps.isClosed()) {
					ps.close();
				}
			}catch(Exception e2) { }
		}
		return rresult;
	}
	
}
