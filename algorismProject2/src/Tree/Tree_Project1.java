package Tree;

import java.util.*;

public class Tree_Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> data = new TreeMap<Integer, String>();	//treemap�� �̿��� ����
		Scanner sc = new Scanner(System.in);
		int menuchoice = 0; // �޴� ���� ����
		int temp;		//��ǰ ��ȣ �Է� ����
		Integer temp2;	//��ǰ ��ȣ integer�� ����
		String Stemp;	//��ǰ�� ����

		// �޴�
		while (true) {		
			System.out.println("(1) ��ǰ ��� (2) ��ǰ ���� (3) ��ǰ �˻� (4) ��ü ��ǰ ��ȸ (5) ����");
			System.out.print("�޴� ���� : ");
			menuchoice = sc.nextInt();	//�޴��� �޴´�
			if (menuchoice == 5) {		// (5) ���ᰡ ���ö� ���� while�� �ݺ�
				break;
			} else {
				switch (menuchoice) {

				case 1:
					System.out.println("��ǰ ���");
					System.out.print("��ǰ ��ȣ �Է� : ");
					temp = sc.nextInt();
					sc.nextLine(); // nextint�� nextLine �ޱ�����
					temp2 = Integer.valueOf(temp); // int�� integer��
					System.out.print("��ǰ�� �Է� : ");
					Stemp = sc.nextLine();
					data.put(temp2, Stemp);		//���� �ִ´�
					System.out.println("");
					break;
				case 2:
					System.out.println("��ǰ ����");
					System.out.print("��ǰ ��ȣ �Է� : ");
					temp = sc.nextInt();
					sc.nextLine();
					temp2 = Integer.valueOf(temp);
					data.remove(temp2);		//���� ��ǰ��ȣ�� ����
					System.out.println("��ǰ ���� �Ϸ�");
					System.out.println("");
					break;
				case 3:
					System.out.println("��ǰ �˻�");
					System.out.print("��ǰ ��ȣ �Է� : ");
					temp = sc.nextInt();
					sc.nextLine();
					temp2 = Integer.valueOf(temp);
					if (data.get(temp2) == null) {
						System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
						System.out.println("");
						break;
					}
					System.out.println("��ǰ�� : " + data.get(temp2));
					System.out.println("");
					break;
				case 4:
					for (Integer i : data.keySet()) {
						System.out.println(i + " " + data.get(i));
					}
					if (data.isEmpty()) {
						System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
					}
					System.out.println("");

					break;
				case 5:
					System.out.println("���α׷� ����");
					break;
				}
			}

		}

	}

}


/*
 * �����˻�Ʈ�� ���� �ڵ�� �Ʒ��� ������, ���� ����� �����ð��� ���� ����, 
 * ���۸��� �Ͽ� ���� �ڵ��̱⿡ ������� �ʾҽ��ϴ�.
 * �׸��� Ǯ���� ���� �ð��� ����ߴ� �ڵ�� �Ϻ��� �Ȱ��� �ڵ尡 ���ۿ� �־ ��Ȳ�߽��ϴ�.
 * https://madplay.github.io/post/binary-search-tree-in-java
 * �Ʒ� ������� �ڵ带 �״�� ����ϸ� ����ϴٸ� �ټ� �������
 * treemap���� ���� �����غ��� �; ���� ���� �����߽��ϴ�.
 * �������� ���ϴ� ������� ������ Ǯ�� �ʾҽ��ϴٸ� �����մϴ�.
 * 
 * ��� �� ������ �ϴ°͵� �ʹ� �����ɷ���.... �׳� �Ʒ� �ڵ� ������ ���� �����ؼ� ���� �׷����ϴ�...
 * ������� ��ȣ�� �ǵ�� ��Ź�帳�ϴ٤���...
 */






/*
 * public boolean removeNode(int element) { Node removeNode = rootNode; Node
 * parentOfRemoveNode = null;
 * 
 * while (removeNode.value != element) { parentOfRemoveNode = removeNode;
 * 
 * ������ ���� ���� ��庸�� ������ ������ Ž���Ѵ�. if (removeNode.value > element) { removeNode =
 * removeNode.leftChild; } else { removeNode = removeNode.rightChild; }
 * 
 * 
 * �� ��Ҹ� ���ϸ� Ž������ �� �� ���(Leaf node)�� ��� ������ ���� Ž�� ����
 * 
 * if (removeNode == null) return false;
 * 
 * }
 * 
 * �ڽ� ��尡 ��� ���� �� if (removeNode.leftChild == null && removeNode.rightChild ==
 * null) { ���� ����� Ʈ���� ��Ʈ�� �� if (removeNode == rootNode) { rootNode = null; }
 * else if (removeNode == parentOfRemoveNode.rightChild) {
 * parentOfRemoveNode.rightChild = null; } else { parentOfRemoveNode.leftChild =
 * null; } }
 * 
 * ������ �ڽ� ��常 �����ϴ� ��� else if (removeNode.leftChild == null) { if (removeNode ==
 * rootNode) { rootNode = removeNode.rightChild; } else if (removeNode ==
 * parentOfRemoveNode.rightChild) {
 * 
 * ���� ����� ������ �ڽ� ��带 ���� ��� ��ġ�� �д�.
 * 
 * parentOfRemoveNode.rightChild = removeNode.rightChild; } else {
 * parentOfRemoveNode.leftChild = removeNode.rightChild; } }
 * 
 * ���� �ڽ� ��常 �����ϴ� ��� else if (removeNode.rightChild == null) { if (removeNode ==
 * rootNode) { rootNode = removeNode.leftChild; } else if (removeNode ==
 * parentOfRemoveNode.rightChild) { parentOfRemoveNode.rightChild =
 * removeNode.leftChild; } else {
 * 
 * ���� ����� ���� �ڽ��� ���� ��� ��ġ�� �д�.
 * 
 * parentOfRemoveNode.leftChild = removeNode.leftChild; } }
 * 
 * 
 * �� ���� �ڽ� ��尡 �����ϴ� ��� ������ ����� ���� ���� Ʈ���� �ִ� ���� ū �� ��带 �ø��ų� ������ ���� Ʈ���� �ִ� ���� ����
 * �� ��带 �ø��� �ȴ�. ���� �ڵ�� 2��° ����� ����Ѵ�.
 * 
 * else { ���� ��� ����� �ڽ� ��� �߿��� ��ü�� ���(replaceNode)�� ã�´�. Node parentOfReplaceNode
 * = removeNode;
 * 
 * ���� ����� ������ ���� Ʈ�� Ž�� ���� Node replaceNode = parentOfReplaceNode.rightChild;
 * 
 * while (replaceNode.leftChild != null) { ���� ���� ���� ã�� ���� ���� �ڽ� ���� Ž���Ѵ�.
 * parentOfReplaceNode = replaceNode; replaceNode = replaceNode.leftChild; }
 * 
 * if (replaceNode != removeNode.rightChild) { ���� ���� ���� �����ϱ� ������ ��ü ����� ���� �ڽ��� ��
 * ��尡 �ȴ�. parentOfReplaceNode.leftChild = replaceNode.rightChild;
 * 
 * ��ü�� ����� ������ �ڽ� ��带 ������ ����� ���������� �����Ѵ�. replaceNode.rightChild =
 * removeNode.rightChild; }
 * 
 * ������ ��尡 ��Ʈ ����� ��� ��ü�� ���� �ٲ۴�. if (removeNode == rootNode) { rootNode =
 * replaceNode; } else if (removeNode == parentOfRemoveNode.rightChild) {
 * parentOfRemoveNode.rightChild = replaceNode; } else {
 * parentOfRemoveNode.leftChild = replaceNode; }
 * 
 * ���� ��� ����� ���� �ڽ��� �մ´�. replaceNode.leftChild = removeNode.leftChild; }
 * 
 * return true; } }
 */
