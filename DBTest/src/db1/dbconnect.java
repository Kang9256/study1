package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dbconnect {

	public static void main(String[] args) {
		// jdbc driver Ŭ������ ��ü ���� ��Ÿ�ӽ� �ε�
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// ���� �ּ�, ����� ����, �н����� ���ڿ� ����
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			//db �����ϱ� ���� ��ü ����
			//drivermanager�� ���� connection ��ü ����
			//mysql ���� ���� : �ּ�, ����� ����, �н����� ����
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			//Ŀ�ؼ� ��ü�� �����Ǹ� db ���� ����
			if (con !=null) {
				System.out.println("db ���� ����");
			}
		
			// sql �� �ۼ�

			
			
			// ������ ������ ���� PreparedStatement ��ü ����
			// Connection �������̽��� prepareStatement() �޼ҵ带 ����Ͽ� ��ü ����
			// sql �� values �� (?) ������ ����

			
			
			
			// ������ ���� : ������ ���� ���� �� ��ȯ
			// select : executeQuery() - ��� �� ReseltSet ��ȯ
			// insert / update / delete : executeUpdate() - ������ ���� ���� �� ��ȯ
				
						
				

			
			con.close();
			
			
		} catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
		}
	}

}
