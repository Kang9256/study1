package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class bookinsert_input_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
		String user = "root";
		String pwd = "1234";
		try {
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		//커넥션 객체가 생성되면 db 연결 성공
		if (con !=null) {
			System.out.println("db 연결 성공");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도서 정보 등록");
		
		
		System.out.println("도서 번호 입력");
		String bookNo = sc.nextLine();
		
		System.out.println("도서명 입력");
		String bookName = sc.nextLine();
	
		System.out.println("저자 입력");
		String bookAuthor = sc.nextLine();
		
		System.out.println("도서 가격 입력");
		int bookPrice = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("발행일 입력");
		String bookDate = sc.nextLine();
		
		System.out.println("도서 가격 입력");
		int bookStock = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("발행일 입력");
		String pubNo = sc.nextLine();
		String sql = "insert into book values(?,?,?,?,?,?,?)";
		
		// 쿼리문 전송을 위한 PreparedStatement 객체 생성
		// Connection 인터페이스의 prepareStatement() 메소드를 사용하여 객체 생성
		// sql 문 values 들어갈 (?) 데이터 설정

		
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, bookNo);
		pstmt.setString(2, bookName);
		pstmt.setString(3, bookAuthor);
		pstmt.setInt(4, bookPrice);
		pstmt.setString(5, bookDate);
		pstmt.setInt(6, bookStock);
		pstmt.setString(7, pubNo);
		
		int result = pstmt.executeUpdate();
		
		if(result > 0) {
			System.out.println("데이터 입력 성공!");
		}

		
	}
		catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
	}
	
	}
}
