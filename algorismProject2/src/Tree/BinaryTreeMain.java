package Tree;

import java.util.*;

public class BinaryTreeMain {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("(1) 상품 등록 (2) 상품 삭제 (3) 상품 검색 (4) 전체 상품 조회 (5) 종료");
		System.out.print("메뉴 선택 : ");
		choice= sc.nextInt();
		
		switch(choice){
		
		case 1 : tree.insertNode(sc.nextInt(), sc.nextLine());
		
		case 2 : 
		
		}
		
		
		tree.insertNode(2);
		tree.insertNode(8);
		tree.insertNode(1);
		tree.insertNode(10);
		tree.insertNode(6);
		tree.insertNode(9);
		tree.insertNode(3);
		tree.insertNode(7);
		
		// 트리 운행(순회)
		tree.preorderTree(tree.rootNode, 0, );
		System.out.println();
		
		tree.inorderTree(tree.rootNode, 0);
		System.out.println();
		
		tree.postorderTree(tree.rootNode, 0);
		System.out.println();
		
		// 이진 트리 검색
		tree.searchBTree(tree.rootNode, 10);

	}

}
