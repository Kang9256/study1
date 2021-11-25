package db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;



//1 생성자에서 db 연결
//2 selectStudent() 메서드 : 데이터베이스의 student 테이블에서 select 한 결과 출력
//3 insertStudent(StudentDTO dto) 메서드
// main() 에서 입력한 student 데이터를 전달 받아서
// student 테이블에 insert작업 수행

public class StudentDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs= null;
	
	//생성자 : 데이터베이스 연결
	public StudentDAO() {
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
	public void selectStudent() {
		
	
		try {
			String sql = "select * from student order by stdNo";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while(rs.next()) {
				String stdNo = rs.getString(1);
				String stdName = rs.getString(2);
				int stdYear = rs.getInt(3);
				String stdAddress = rs.getString(4);
				Date stdBirthday = rs.getDate(5);
				String dptNo = rs.getString(6);
				
				System.out.format("%-10s\t %-10s\t %-4d\t %-20s\t %13s\t %5s \n", stdNo, stdName, stdYear, stdAddress, stdBirthday, dptNo );
				
			}
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		
	}
	
	public void insertStudent(StudentDTO dto) {
		String sql = "insert into student values(?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getStdNo());
			pstmt.setString(2, dto.getStdName());
			pstmt.setInt(3, dto.getStdYear());
			pstmt.setString(4, dto.getStdAddress());
			pstmt.setString(5, dto.getStdBirthday());
			pstmt.setString(6, dto.getDptNo());
			
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
