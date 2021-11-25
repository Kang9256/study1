package javaProject1;

import java.util.*;

class Product {
	String prdNo;
	String prdName;
	int prdPrice;
	int prdYear;
	String prdMaker;

	Product() {
	}

	Product(String prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}

	public String toString() {
		System.out.print(this.prdNo.toString() + "\t");
		System.out.print(this.prdName.toString() + "\t");
		System.out.print(Integer.toString(this.prdPrice) + "\t");
		System.out.print(Integer.toString(this.prdYear) + "\t");
		System.out.println(this.prdMaker.toString() + "\t");
		return "";
	}
}

public class ProductTest extends Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("001", "��Ʈ��", 1200000, 2021, "�Ｚ");
		Product p2 = new Product("002", "�����", 300000, 2021, "LG");
		Product p3 = new Product("003", "���콺", 30000, 2020, "������");
		System.out.print("��ǰ��ȣ\t��ǰ��\t����\t����\t������\n");
		System.out.println("--------------------------------------");
		p1.toString();
		p2.toString();
		p3.toString();
		}
	}
	
