package javaProject2;

import java.util.*;

class Book {
	String bookNo;
	String bookTitle;
	String bookAuthor;
	int bookYear;
	int bookPrice;
	String bookPublisher;

	Book() {		//����Ʈ ������

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
		System.out.println("������ȣ\t������\t\t����\t����\t������\t���ǻ�");
		System.out.println("-----------------------------------------------------------");
	}

	public String toString() {		//toString �޼��� �������̵� << Ȥ�� �� �����ϰ� ���� �� �ֳ�..?
		System.out.print(this.bookNo.toString() + "\t");
		System.out.print(this.bookTitle.toString() + "\t");
		System.out.print(this.bookAuthor.toString() + "\t");
		System.out.print(Integer.toString(this.bookYear) + "\t");
		System.out.print(Integer.toString(this.bookPrice) + "\t");
		System.out.print(this.bookPublisher.toString()+"\n");
		return "\n";
	}
}

class Magazine extends Book {		//���
	String month;

	Magazine() {

	}

	Magazine(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher, String month) {
		super(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher); //Book Ŭ���� ������ ȣ��(��Ȱ��)
		this.month = month;
	}
	void printMagazineColumn() {
		System.out.println("������ȣ\t������\t������\t����\t���࿬��\t���ǻ�\t�����");
		System.out.println("-----------------------------------------------------------");
	}

	public String toString() {		// �������̵� << Ȥ�� �� �����ϰ� ���� �� �ֳ���?
		System.out.print(this.bookNo.toString() + "\t");
		System.out.print(this.bookTitle.toString() + "\t");
		System.out.print(this.bookAuthor.toString() + "\t");
		System.out.print(Integer.toString(this.bookYear) + "\t");
		System.out.print(Integer.toString(this.bookPrice) + "\t");
		System.out.print(this.bookPublisher.toString() + "\t");
		System.out.printf("%5s",this.month.toString()+"\n");		// �߰� ����, ������ ����
		return "";
	}

}

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("B001", "�ڹ� ���α׷���", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�");
		Book b2 = new Book("B002", "�ڹٽ�ũ��Ʈ", "�̸���", 30000, 2020, "�������ǻ�");
		Book b3 = new Book("B003", "HTML//CSS", "������", 18000, 2021, "�������ǻ�");
		Magazine m1 = new Magazine("M001", "�ڹ� ����", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�", "5");
		Magazine m2 = new Magazine("M002", "�� ����", "�̸���", 30000, 2020, "�������ǻ�", "7");
		Magazine m3 = new Magazine("M003", "���� ����", "������", 18000, 2021, "�������ǻ�", "9");
		
		b1.printBookColumn();		// Book ������ �׸� ���
		b1.toString();
		b2.toString();
		b3.toString();
		System.out.println();
		m1.printMagazineColumn();		// Magazine ������ �׸� ���
		m1.toString();
		m2.toString();
		m3.toString();
		
	}

}
