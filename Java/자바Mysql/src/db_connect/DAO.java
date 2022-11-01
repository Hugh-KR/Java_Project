package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

	public MemberVO one(String id) throws Exception {
		
		MemberVO bag = null; //쓰레기값 초기화 필수

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
		String user = "scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ok....");

		String sql = "select * from member where id = ? ";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL�� ���� ok....");

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			System.out.println("4. SQL 반영된 row 수 ok...." + rs.next());
			String id2 = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			System.out.println(id2);
			//가방을 만들어서.
			bag = new MemberVO();
			//데이터를 넣고.
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);

			
		}

//db처리와 관련된 메모리 할당괸 것 해제시켜주자.
		ps.close();
		con.close();
		rs.close();
		//메서드의 처리를 다 끝내고 결과를 보내줘 (맨끝에)
		return bag;
		
	}

	public void delete(String id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. ����̹� ���� ok....");

		String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
		String user = "scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ok....");

		String sql = "delete from member where id = ? ";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL�� ���� ok....");

		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ok....");

		ps.close();
		con.close();
	}

	public void insert(MemberVO bag) throws Exception {
		// 1~3: apache iBatis-> google myBatis
		// ���̹�Ƽ��
		// 1. ����̹�(Ŀ����) ����
		System.out.println(bag);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� ok....");

		// 2. db����(shop, root, 1234)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ok....");

		// 3. sql�� ����
		String sql = "insert into member values (?,?,?,?)";
		// String sql = "delete from member where id = '700' ";
		// SQL������ ����ϴ� ��ü�� ������־�� �ڹٴ� �ν�
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());

		System.out.println("3. SQL�� ���� ok....");

		// 4. sql�� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ok....");

		ps.close();
		con.close();
	}

}
