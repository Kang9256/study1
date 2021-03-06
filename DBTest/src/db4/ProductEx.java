package db4;

import java.util.Scanner;

public class ProductEx {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	ProductDAO prdDAO = new ProductDAO();
	
	System.out.println("제품번호 입력:");
	String prdNo = sc.nextLine();
	
	System.out.println("제품이름 입력:");
	String prdName = sc.nextLine();
	
	System.out.println("제품 가격 입력:");
	int prdPrice = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("제품 브랜드 입력:");
	String prdMaker = sc.nextLine();
	
	System.out.println("제품 색깔 입력:");
	String prdColor = sc.nextLine();
	
	System.out.println("ctg 입력:");
	String ctgNo = sc.nextLine();
	
	ProductDTO prdDTO = new ProductDTO(prdNo,prdName,prdPrice,prdMaker,prdColor,ctgNo);

	prdDAO.insertProduct(prdDTO);
	
	prdDAO.selectProduct();
}
	
}
