package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class ProductSelectEX {

	public static void main(String[] args) {
		
		
		try {
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			if (con !=null) {
				System.out.println("db 연결 성공");
			}
			
			String sql = "select * from product order by prdno";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				// (1) next()하면서 한행씩 데이터를 가져와서 변수에 저장
				String PRDno = rs.getString(1);
				String prdName = rs.getString(2);
				int prdPrice = rs.getInt(3);
				String prdMaker = rs.getString(4);
				String prdColor = rs.getString(5);
				String ctgNo = rs.getString(6);
				
				
				// (2) 한행씩 변수값 출력
				System.out.format("%-5s\t %-15s\t %-10d %6s\t %13s \t%3s \n",PRDno, prdName, prdPrice, prdMaker, prdColor, ctgNo);
				
			}
			rs.close();
			
			pstmt.close();
			con.close();
		} 
		
		catch (Exception e) {
			System.out.println("db연결 실패");
			e.printStackTrace();
		}

	}

}
