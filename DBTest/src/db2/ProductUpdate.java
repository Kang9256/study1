package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductUpdate {

	public static void main(String[] args) {
		System.out.println("���� ���� ����");
		System.out.println("--------------------------\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ��ǰ�̸� �Է� : ");
		String prdName = sc.nextLine();
		
		System.out.print("��ǰ���� �Է� : ");
		int prdPrice = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("�귣�� �Է� : ");
		String prdMaker = sc.nextLine();
		
		System.out.print("��ǰ�� �Է� : ");
		String prdColor = sc.nextLine();
		
		
		System.out.print("ctgno �Է� : ");
		String ctgNo = sc.nextLine();
		
		System.out.print("��ǰ ��ȣ �Է� : ");
		String PRDno = sc.nextLine();
		
		
		
		
	try {
		
		String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
		String user = "root";
		String pwd = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		if (con !=null) {
			System.out.println("db ���� ����");
		}
		// SQL �ۼ�
		// ������ ���� : UPDATE�� : UPDATE ���̺�� SET ���̸�=�� WHERE ����;
		// �Էµ� ������ ���� ��ȣ�� ã�Ƽ� �Էµ� ������ ����
		// ����! �⺻Ű ���� �Ұ��ϹǷ� bookNo�� set�� ����
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
			System.out.println("�Է¼���");
		}
		
		pstmt.close();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}

}
