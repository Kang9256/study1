package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("상품 정보 삭제");
		System.out.println("--------------------------\n");
		
		System.out.print("삭제할 상품번호 입력 : ");
		String prdNo = sc.next();		
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			// Connection 객체가 생성되면 DB 연결 성공
			if(con != null) {
				System.out.println("DB 연결 성공!");
			}			
			
		
			String sql = "delete from product where prdNo=?";
			
			// 쿼리문 전송을 위한 PreparedStatement 객체 생성
			// Connection 인터페이스의 prepareStatement() 메소드를 사용하여 객체 생성
			// sql 문에서 검색할 값(?)에 데이터 설정
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, prdNo);			
			
			// 실행 쿼리문 : 영향을 받은 행의 수 반환
			int result = pstmt.executeUpdate();
			
			// 결과 출력 : 성공!
			if(result > 0)
				System.out.println("데이터 삭제 성공!");
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
		
		
		
		
	}

}
