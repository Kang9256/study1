package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO{
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs= null;
	
	//생성자 : 데이터베이스 연결
	public BookDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결 주소, 사용자 계정, 패스워드 문자열 설정
			String url = "jdbc:mysql://localhost:3306/db_project1?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, user, pwd);
			
			if (con !=null) {
				System.out.println("db 연결 성공");
			}
			
			
		} catch (Exception e) {
			System.out.println("db 연결 불가능!");
			e.printStackTrace();
		}
	}

	//2 selectStudent() 메서드 : 데이터베이스의 student 테이블에서 select 한 결과 출력
	public void selectBook() {
		
	
		try {
			String sql = "select * from book order by bookNo";
			
			//String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookTitle = rs.getString(2);
				String bookAuthor = rs.getString(3);
				int bookYear = rs.getInt(4);
				int bookPrice = rs.getInt(5);
				String bookPublisher = rs.getString(6);
				
				System.out.format("%-10s\t %-10s\t %-4s\t %-20d\t %13d\t %5s \n", bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
				
			}
		} catch (Exception e) {
			System.out.println(" 출력 오류 발생");
			e.printStackTrace();
		}
		
	}
	
	public void insertBook(BookDTO dto) {
		String sql = "insert into book values(?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBookNo());
			pstmt.setString(2, dto.getBookTitle());
			pstmt.setString(3, dto.getBookAuthor());
			pstmt.setInt(4, dto.getBookYear());
			pstmt.setInt(5, dto.getBookPrice());
			pstmt.setString(6, dto.getBookPublisher());
			
			// 쿼리문 실행
			int result = pstmt.executeUpdate();
			if(result >0) {
				System.out.println("데이터 입력 성공");
			}
			
		} catch (Exception e) {
			System.out.println("입력 오류 발생");
			e.printStackTrace();
		}
				
	}
	
	
	
}