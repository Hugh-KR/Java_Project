package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDao {
	 private Connection conn; //DB 커넥션 연결 객체
	    private static final String USERNAME = "root";//DBMS접속 시 아이디
	    private static final String PASSWORD = "s2317884";//DBMS접속 시 비밀번호
	    private static final String URL = "jdbc:mysql://localhost:3306/boarddb";//DBMS접속할 db명
	    
	    public BoardDao() {
	        try {
	            System.out.println("생성자");
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	            System.out.println("드라이버 로딩 성공");
	        } catch (Exception e) {
	            System.out.println("드라이버 로딩 실패 ");
	            try {
	                conn.close();
	            } catch (SQLException e1) {    }
	        }
	        
	        
	    }
	    
	    public void insertBoard(){
	        //쿼리문 준비
	        String sql = "insert into board values(?,?,?,?,?,?)";
	        
	        PreparedStatement pstmt = null;
	        try {
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setString(1, null);
	            pstmt.setString(2, "안녕하세요");
	            pstmt.setString(3, "1111");
	            pstmt.setString(4, "공개");
	            pstmt.setString(5, "홍길동");
	            pstmt.setString(6, "반갑습니다.");
	            
	            int result = pstmt.executeUpdate();
	            if(result==1) {
	                System.out.println("Board데이터 삽입 성공!");
	                
	            }
	            
	        } catch (Exception e) {
	            System.out.println("Board데이터 삽입 실패!");
	        }    finally {
	            try {
	                if(pstmt!=null && !pstmt.isClosed()) {
	                    pstmt.close();
	                }
	            } catch (Exception e2) {}
	        }
	    }

	    //조건에 맞는 행을 db에서 1개 행만 가져오는 메서드
	    public void selectOne(int id) {
	        String sql = "select * from board where id = ?";
	        PreparedStatement pstmt = null;
	        try {
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setInt(1, id);
	            ResultSet rs = pstmt.executeQuery();
	            if(rs.next()) {
	                System.out.println("id: " + rs.getInt("id"));
	                System.out.println("boardTitle: " + rs.getString("boardTitle"));
	                System.out.println("boardPassword: " + rs.getString("boardPassword"));
	                System.out.println("comboPublic: " + rs.getString("comboPublic"));
	                System.out.println("writerName: " + rs.getString("writerName"));
	                System.out.println("textContent: " + rs.getString("textContent"));
	                
	            }
	            
	            
	            
	        } catch (Exception e) {
	            System.out.println("select 메서드 예외발생");
	        }    finally {
	            try {
	                if(pstmt!=null && !pstmt.isClosed()) {
	                    pstmt.close();
	                }
	            } catch (Exception e2) {}
	        }
	    }
	    
	  //조건에 맞는 행을 DB에서 수정(갱신)    하는 메서드
	    public void updateBoard(int id) {
	        String sql = "update board set boardPassword =?, writerName =? where id=?";
	        PreparedStatement pstmt = null;
	        try {
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setString(1,"7777");
	            pstmt.setString(2,"문재인");
	            pstmt.setInt(3,id);
	            pstmt.executeUpdate();
	            System.out.println("수정된 id: " + id);
	            
	        } catch (Exception e) {
	            System.out.println("update 예외 발생");
	        }    finally {
	            try {
	                if(pstmt!=null && !pstmt.isClosed()) {
	                    pstmt.close();
	                }
	            } catch (Exception e2) {}
	        }
	    }
}
