package javaProject2;

import java.util.*;

class Book {
	String bookNo;
	String bookTitle;
	String bookAuthor;
	int bookYear;
	int bookPrice;
	String bookPublisher;

	Book() {		//디폴트 생성자

	}

	Book(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}
	void printBookColumn() {
		System.out.println("도서번호\t도서명\t\t저자\t가격\t발행일\t출판사");
		System.out.println("-----------------------------------------------------------");
	}

	public String toString() {		//toString 메서드 오버라이드 << 혹시 더 간결하게 만들 수 있나..?
		System.out.print(this.bookNo.toString() + "\t");
		System.out.print(this.bookTitle.toString() + "\t");
		System.out.print(this.bookAuthor.toString() + "\t");
		System.out.print(Integer.toString(this.bookYear) + "\t");
		System.out.print(Integer.toString(this.bookPrice) + "\t");
		System.out.print(this.bookPublisher.toString()+"\n");
		return "\n";
	}
}

class Magazine extends Book {		//상속
	String month;

	Magazine() {

	}

	Magazine(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher, String month) {
		super(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher); //Book 클래스 생성자 호출(재활용)
		this.month = month;
	}
	void printMagazineColumn() {
		System.out.println("잡지번호\t잡지명\t발행인\t가격\t발행연도\t출판사\t발행월");
		System.out.println("-----------------------------------------------------------");
	}

	public String toString() {		// 오버라이딩 << 혹시 더 간결하게 만들 수 있나요?
		System.out.print(this.bookNo.toString() + "\t");
		System.out.print(this.bookTitle.toString() + "\t");
		System.out.print(this.bookAuthor.toString() + "\t");
		System.out.print(Integer.toString(this.bookYear) + "\t");
		System.out.print(Integer.toString(this.bookPrice) + "\t");
		System.out.print(this.bookPublisher.toString() + "\t");
		System.out.printf("%5s",this.month.toString()+"\n");		// 추가 내용, 오른쪽 정렬
		return "";
	}

}

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("B001", "자바 프로그래밍", "홍길동", 25000, 2021, "멀티출판사");
		Book b2 = new Book("B002", "자바스크립트", "이몽룡", 30000, 2020, "서울출판사");
		Book b3 = new Book("B003", "HTML//CSS", "성춘향", 18000, 2021, "강남출판사");
		Magazine m1 = new Magazine("M001", "자바 월드", "홍길동", 25000, 2021, "멀티출판사", "5");
		Magazine m2 = new Magazine("M002", "웹 월드", "이몽룡", 30000, 2020, "서울출판사", "7");
		Magazine m3 = new Magazine("M003", "게임 월드", "성춘향", 18000, 2021, "강남출판사", "9");
		
		b1.printBookColumn();		// Book 데이터 항목 출력
		b1.toString();
		b2.toString();
		b3.toString();
		System.out.println();
		m1.printMagazineColumn();		// Magazine 데이터 항목 출력
		m1.toString();
		m2.toString();
		m3.toString();
		
	}

}
