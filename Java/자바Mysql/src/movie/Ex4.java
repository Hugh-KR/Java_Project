package movie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		String url = "jdbc:mysql://localhost:3306/study_db";
		String user = "root";
		String pass = "s2317884";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stm = conn.createStatement(0, 0);
			String sql = "SELECT * FROM sj";
			stm.executeQuery(sql);
			System.out.println(conn);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
