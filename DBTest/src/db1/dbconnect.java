package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dbconnect {

	public static void main(String[] args) {
		// jdbc driver 클래스의 객체 생성 런타임시 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결 주소, 사용자 계정, 패스워드 문자열 설정
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			//db 연결하기 위한 객체 생성
			//drivermanager를 통해 connection 객체 생성
			//mysql 서버 연결 : 주소, 사용자 계정, 패스워드 전송
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			//커넥션 객체가 생성되면 db 연결 성공
			if (con !=null) {
				System.out.println("db 연결 성공");
			}
		
			// sql 문 작성

			
			
			// 쿼리문 전송을 위한 PreparedStatement 객체 생성
			// Connection 인터페이스의 prepareStatement() 메소드를 사용하여 객체 생성
			// sql 문 values 들어갈 (?) 데이터 설정

			
			
			
			// 쿼리문 실행 : 영향을 받은 행의 수 반환
			// select : executeQuery() - 결과 행 ReseltSet 반환
			// insert / update / delete : executeUpdate() - 영향을 받은 행의 수 반환
				
						
				

			
			con.close();
			
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
	}

}
