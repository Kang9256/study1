package Tree;

public class Node {
	int value;
	String product;
	Node leftChild;
	Node rightChild;
	
	//������ : ��� ���� �ʱ�ȭ
	public Node(int value, String product) {
		this.value = value;
		this.product = product;
		leftChild = null;  // ��ü�̹Ƿ� null ������ �ʱ�ȭ
		rightChild = null;
}
}