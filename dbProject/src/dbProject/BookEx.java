package dbProject;

import java.util.Scanner;


public class BookEx {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	BookDAO bookDAO = new BookDAO();
	
	System.out.println("책 번호 입력:");
	String bookNo = sc.nextLine();
	
	System.out.println("책 제목 입력:");
	String bookTitle = sc.nextLine();
	
	System.out.println("책 저자 입력:");
	String bookAuthor = sc.nextLine();
	
	System.out.println("출판 년도 입력:");
	int bookYear = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("책 가격 입력:");
	int bookPrice = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("출판사 입력:");
	String bookPublisher = sc.nextLine();
	
	BookDTO bookDTO= new BookDTO(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);

	bookDAO.insertBook(bookDTO);
	
	Select.selectBook();
}
	
}