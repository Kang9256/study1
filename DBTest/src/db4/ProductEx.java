package db4;

import java.util.Scanner;

public class ProductEx {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	ProductDAO prdDAO = new ProductDAO();
	
	System.out.println("��ǰ��ȣ �Է�:");
	String prdNo = sc.nextLine();
	
	System.out.println("��ǰ�̸� �Է�:");
	String prdName = sc.nextLine();
	
	System.out.println("��ǰ ���� �Է�:");
	int prdPrice = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("��ǰ �귣�� �Է�:");
	String prdMaker = sc.nextLine();
	
	System.out.println("��ǰ ���� �Է�:");
	String prdColor = sc.nextLine();
	
	System.out.println("ctg �Է�:");
	String ctgNo = sc.nextLine();
	
	ProductDTO prdDTO = new ProductDTO(prdNo,prdName,prdPrice,prdMaker,prdColor,ctgNo);

	prdDAO.insertProduct(prdDTO);
	
	prdDAO.selectProduct();
}
	
}