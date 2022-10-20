package movie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		String url = "jdbc:mysql://localhost:3306/study_db";
		String user = "root";
		String pass = "s2317884";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름= ");
		String name = in.readLine();
		System.out.print("전화번호= ");
		String no = in.readLine();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver ok");
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("로그인 ok");
			String sql = "insert into phone values(?,?);";
			PreparedStatement ptm = conn.prepareStatement(sql);
			ptm.setString(1, name);
			ptm.setString(2, no);
			ptm.executeUpdate();
			ptm.close();
			conn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
