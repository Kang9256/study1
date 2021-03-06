package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProductInsertEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String PRDno = "1017";
		String prdName = "성우의 주먹";
		int prdPrice = 77777;
		String prdMaker = "강성우컴퍼니";
		String prdColor = "성우색";
		String ctgNo = "2";
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		//커넥션 객체가 생성되면 db 연결 성공
		if (con !=null) {
			System.out.println("db 연결 성공");
		}
		String sql1 = "insert into product values(?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql1);
		
		
		pstmt.setString(1, PRDno);
		pstmt.setString(2, prdName);
		pstmt.setInt(3, prdPrice);
		pstmt.setString(4, prdMaker);
		pstmt.setString(5, prdColor);
		pstmt.setString(6, ctgNo);
		
		int aaa = pstmt.executeUpdate();
	
		
		if(aaa>0) {
			System.out.println("입력성공");
		}
		pstmt.close();
		con.close();
		
		// 쿼리문 전송을 위한 PreparedStatement 객체 생성
		// Connection 인터페이스의 prepareStatement() 메소드를 사용하여 객체 생성
		// sql 문 values 들어갈 (?) 데이터 설정

		
	
	}
		catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
	}
	
	}
}
