package Tree;

import java.util.*;

public class BinaryTreeMain {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("(1) ��ǰ ��� (2) ��ǰ ���� (3) ��ǰ �˻� (4) ��ü ��ǰ ��ȸ (5) ����");
		System.out.print("�޴� ���� : ");
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
		
		// Ʈ�� ����(��ȸ)
		tree.preorderTree(tree.rootNode, 0, );
		System.out.println();
		
		tree.inorderTree(tree.rootNode, 0);
		System.out.println();
		
		tree.postorderTree(tree.rootNode, 0);
		System.out.println();
		
		// ���� Ʈ�� �˻�
		tree.searchBTree(tree.rootNode, 10);

	}

}
