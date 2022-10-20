package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/study_db";
			String user="root";
			String pass="s2317884";
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 있당.");
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement stm = conn.createStatement();
			String sql = "INSERT INTO abc VALUES('kim', 30);";
			stm.executeUpdate(sql);
			stm.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 없당.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
