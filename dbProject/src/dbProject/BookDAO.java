package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO{
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs= null;
	
	//������ : �����ͺ��̽� ����
	public BookDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// ���� �ּ�, ����� ����, �н����� ���ڿ� ����
			String url = "jdbc:mysql://localhost:3306/db_project1?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, user, pwd);
			
			if (con !=null) {
				System.out.println("db ���� ����");
			}
			
			
		} catch (Exception e) {
			System.out.println("db ���� �Ұ���!");
			e.printStackTrace();
		}
	}

	//2 selectStudent() �޼��� : �����ͺ��̽��� student ���̺��� select �� ��� ���
	public void selectBook() {
		
	
		try {
			String sql = "select * from book order by bookNo";
			
			//String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookTitle = rs.getString(2);
				String bookAuthor = rs.getString(3);
				int bookYear = rs.getInt(4);
				int bookPrice = rs.getInt(5);
				String bookPublisher = rs.getString(6);
				
				System.out.format("%-10s\t %-10s\t %-4s\t %-20d\t %13d\t %5s \n", bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
				
			}
		} catch (Exception e) {
			System.out.println(" ��� ���� �߻�");
			e.printStackTrace();
		}
		
	}
	
	public void insertBook(BookDTO dto) {
		String sql = "insert into book values(?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBookNo());
			pstmt.setString(2, dto.getBookTitle());
			pstmt.setString(3, dto.getBookAuthor());
			pstmt.setInt(4, dto.getBookYear());
			pstmt.setInt(5, dto.getBookPrice());
			pstmt.setString(6, dto.getBookPublisher());
			
			// ������ ����
			int result = pstmt.executeUpdate();
			if(result >0) {
				System.out.println("������ �Է� ����");
			}
			
		} catch (Exception e) {
			System.out.println("�Է� ���� �߻�");
			e.printStackTrace();
		}
				
	}
	
	
	
}