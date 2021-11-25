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
				System.out.println("db ���� ����");
			}
			
			String sql = "select * from product order by prdno";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				// (1) next()�ϸ鼭 ���྿ �����͸� �����ͼ� ������ ����
				String PRDno = rs.getString(1);
				String prdName = rs.getString(2);
				int prdPrice = rs.getInt(3);
				String prdMaker = rs.getString(4);
				String prdColor = rs.getString(5);
				String ctgNo = rs.getString(6);
				
				
				// (2) ���྿ ������ ���
				System.out.format("%-5s\t %-15s\t %-10d %6s\t %13s \t%3s \n",PRDno, prdName, prdPrice, prdMaker, prdColor, ctgNo);
				
			}
			rs.close();
			
			pstmt.close();
			con.close();
		} 
		
		catch (Exception e) {
			System.out.println("db���� ����");
			e.printStackTrace();
		}

	}

}
