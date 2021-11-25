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
		String prdName = "������ �ָ�";
		int prdPrice = 77777;
		String prdMaker = "���������۴�";
		String prdColor = "�����";
		String ctgNo = "2";
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		//Ŀ�ؼ� ��ü�� �����Ǹ� db ���� ����
		if (con !=null) {
			System.out.println("db ���� ����");
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
			System.out.println("�Է¼���");
		}
		pstmt.close();
		con.close();
		
		// ������ ������ ���� PreparedStatement ��ü ����
		// Connection �������̽��� prepareStatement() �޼ҵ带 ����Ͽ� ��ü ����
		// sql �� values �� (?) ������ ����

		
	
	}
		catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
	}
	
	}
}