package db4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs= null;
	
	//생성자 : 데이터베이스 연결
	public ProductDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결 주소, 사용자 계정, 패스워드 문자열 설정
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
		
			con = DriverManager.getConnection(url, user, pwd);
			
			if (con !=null) {
				System.out.println("db 연결 성공");
			}
			
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
	}

	//2 selectStudent() 메서드 : 데이터베이스의 student 테이블에서 select 한 결과 출력
	public void selectProduct() {
		
	
		try {
			String sql = "select * from product order by prdNo";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while(rs.next()) {
				String prdNo = rs.getString(1);
				String prdName = rs.getString(2);
				int prdPrice = rs.getInt(3);
				String prdMaker = rs.getString(4);
				String prdColor = rs.getString(5);
				String ctgNo = rs.getString(6);
				
				System.out.format("%-10s\t %-10s\t %-4d\t %-20s\t %13s\t %5s \n", prdNo, prdName, prdPrice, prdMaker, prdColor, ctgNo);
				
			}
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		
	}
	
	public void insertProduct(ProductDTO dto) {
		String sql = "insert into student values(?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPrdNo());
			pstmt.setString(2, dto.getPrdName());
			pstmt.setInt(3, dto.getPrdPrice());
			pstmt.setString(4, dto.getPrdMaker());
			pstmt.setString(5, dto.getPrdColor());
			pstmt.setString(6, dto.getCtgNo());
			
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
	
	//3 insertStudent(StudentDTO dto) 메서드
	
}
