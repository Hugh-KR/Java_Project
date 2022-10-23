package movie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		String url = "jdbc:mysql://localhost:3306/study_db";
		String user = "root";
		String pass = "s2317884";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stm = conn.createStatement();
			String sql = "SELECT * FROM sj;";
			ResultSet rs = stm.executeQuery(sql);
			int tot = 0;
			String avg;
			
			while(rs.next()) {
				tot = rs.getInt(2) + rs.getInt(3) + rs.getInt(4);
				avg = String.format("%.1f",(float)tot/3);
				System.out.println(rs.getString(1) + ":" + tot + ":" + avg);
			}
			rs.close();
			stm.close();
			conn.close();
			//System.out.println(conn);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
 