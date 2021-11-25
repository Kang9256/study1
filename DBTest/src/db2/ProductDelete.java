package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("��ǰ ���� ����");
		System.out.println("--------------------------\n");
		
		System.out.print("������ ��ǰ��ȣ �Է� : ");
		String prdNo = sc.next();		
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			// Connection ��ü�� �����Ǹ� DB ���� ����
			if(con != null) {
				System.out.println("DB ���� ����!");
			}			
			
		
			String sql = "delete from product where prdNo=?";
			
			// ������ ������ ���� PreparedStatement ��ü ����
			// Connection �������̽��� prepareStatement() �޼ҵ带 ����Ͽ� ��ü ����
			// sql ������ �˻��� ��(?)�� ������ ����
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, prdNo);			
			
			// ���� ������ : ������ ���� ���� �� ��ȯ
			int result = pstmt.executeUpdate();
			
			// ��� ��� : ����!
			if(result > 0)
				System.out.println("������ ���� ����!");
			
		} catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
		}
		
		
		
		
	}

}
