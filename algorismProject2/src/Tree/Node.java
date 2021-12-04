package Tree;

public class Node {
	int value;
	String product;
	Node leftChild;
	Node rightChild;
	
	//생성자 : 멤버 변수 초기화
	public Node(int value, String product) {
		this.value = value;
		this.product = product;
		leftChild = null;  // 객체이므로 null 값으로 초기화
		rightChild = null;
}
}