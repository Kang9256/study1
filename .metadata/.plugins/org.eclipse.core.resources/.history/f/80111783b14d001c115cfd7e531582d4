package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductUpdate {

	public static void main(String[] args) {
		System.out.println("도서 정보 수정");
		System.out.println("--------------------------\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수정할 상품이름 입력 : ");
		String prdName = sc.nextLine();
		
		System.out.print("상품가격 입력 : ");
		int prdPrice = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("브랜드 입력 : ");
		String prdMaker = sc.nextLine();
		
		System.out.print("상품색 입력 : ");
		String prdColor = sc.nextLine();
		
		
		System.out.print("ctgno 입력 : ");
		String ctgNo = sc.nextLine();
		
		System.out.print("상품 번호 입력 : ");
		String PRDno = sc.nextLine();
		
		
		
		
	try {
		
		String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
		String user = "root";
		String pwd = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		if (con !=null) {
			System.out.println("db 연결 성공");
		}
		// SQL 작성
		// 데이터 수정 : UPDATE문 : UPDATE 테이블명 SET 열이름=값 WHERE 조건;
		// 입력된 수정할 도서 번호로 찾아서 입력된 값으로 변경
		// 주의! 기본키 변경 불가하므로 bookNo는 set에 없음
		String sql = "update product set prdName=?, prdPrice=?, "
				+ "prdMaker=?, prdColor=?, ctgNo=? where PRDno=?";

		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, prdName);
		pstmt.setInt(2, prdPrice);
		pstmt.setString(3, prdMaker);
		pstmt.setString(4, prdColor);
		pstmt.setString(5, ctgNo);
		pstmt.setString(6, PRDno);
		
		int aaa = pstmt.executeUpdate();
	
		
		if(aaa>0) {
			System.out.println("입력성공");
		}
		
		pstmt.close();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}

}
