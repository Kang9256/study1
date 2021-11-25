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
		
		//Ŀ�ؼ� ��ü�� �����Ǹ� db ���� ����
		if (con !=null) {
			System.out.println("db ���� ����");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� ���");
		
		
		System.out.println("���� ��ȣ �Է�");
		String bookNo = sc.nextLine();
		
		System.out.println("������ �Է�");
		String bookName = sc.nextLine();
	
		System.out.println("���� �Է�");
		String bookAuthor = sc.nextLine();
		
		System.out.println("���� ���� �Է�");
		int bookPrice = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("������ �Է�");
		String bookDate = sc.nextLine();
		
		System.out.println("���� ���� �Է�");
		int bookStock = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("������ �Է�");
		String pubNo = sc.nextLine();
		String sql = "insert into book values(?,?,?,?,?,?,?)";
		
		// ������ ������ ���� PreparedStatement ��ü ����
		// Connection �������̽��� prepareStatement() �޼ҵ带 ����Ͽ� ��ü ����
		// sql �� values �� (?) ������ ����

		
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
			System.out.println("������ �Է� ����!");
		}

		
	}
		catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
	}
	
	}
}