package dbProject;

import java.util.Scanner;


public class BookEx {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	BookDAO bookDAO = new BookDAO();
	
	System.out.println("å ��ȣ �Է�:");
	String bookNo = sc.nextLine();
	
	System.out.println("å ���� �Է�:");
	String bookTitle = sc.nextLine();
	
	System.out.println("å ���� �Է�:");
	String bookAuthor = sc.nextLine();
	
	System.out.println("���� �⵵ �Է�:");
	int bookYear = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("å ���� �Է�:");
	int bookPrice = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("���ǻ� �Է�:");
	String bookPublisher = sc.nextLine();
	
	BookDTO bookDTO= new BookDTO(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);

	bookDAO.insertBook(bookDTO);
	
	Select.selectBook();
}
	
}