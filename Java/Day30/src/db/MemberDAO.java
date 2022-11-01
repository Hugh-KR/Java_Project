package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberDAO {

	public void insert(String id, String name, String gender, String tel, String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("1. 드라이버 연결 성공.");

			String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "abcd";
			String password = "12345678";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			// 3. sql문을 만든다.
			String sql = "insert into member values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, gender);
			ps.setString(4, tel);
			ps.setString(5, email);

			System.out.println("3. sql문 객체생성 성공.");

			// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었다. 자바프로그램에 알려줌.
			int result = ps.executeUpdate(); // r 의 결과는 table, cud는 숫자
			System.out.println("4. SQL문 전송 성공. ==>" + result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정.

	} // insert

	// 기능하나당 매서드 하나
	public void delete(String id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("1. 드라이버 연결 성공.");

			String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "abcd";
			String password = "12345678";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			// 3. sql문을 만든다.
			String sql = "delete from member where s_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. sql문 객체생성 성공.");

			// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었다. 자바프로그램에 알려줌.
			int result = ps.executeUpdate(); // r 의 결과는 table, cud는 숫자
			System.out.println("4. SQL문 전송 성공. ==>" + result);

			if(ps!=null && !ps.isClosed()) {
                ps.close();
            }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} // 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정.

	} // delete

	public void update(String id, String name, String gender, String tel, String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("1. 드라이버 연결 성공.");

			String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "abcd";
			String password = "12345678";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");

			// 3. sql문을 만든다.
			String sql = "update member set name = ?, gender = ?, tel = ?, email = ? where s_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, tel);
			ps.setString(4, email);
			ps.setString(5, id);

			System.out.println("3. sql문 객체생성 성공.");

			// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었다. 자바프로그램에 알려줌.
			int result = ps.executeUpdate(); // r 의 결과는 table, cud는 숫자
			System.out.println("4. SQL문 전송 성공. ==>" + result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정.

	} // update

	public void select(String id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "abcd";
			String password = "12345678";

			Connection con = DriverManager.getConnection(url, user, password);

			// 3. sql문을 만든다.
			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);
		
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String s_id = rs.getString("s_id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String tel = rs.getString("tel");
                String email = rs.getString("email"); //rs.getString("email");

                System.out.println(s_id + " " + name + " " + gender + " " + tel + " " + email);
                
            }
			
			// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었다. 자바프로그램에 알려줌.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정.

	} // select

	
	
	
}
