package Tree;

import java.util.*;

public class Tree_Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> data = new TreeMap<Integer, String>();	//treemap을 이용해 구현
		Scanner sc = new Scanner(System.in);
		int menuchoice = 0; // 메뉴 선택 변수
		int temp;		//상품 번호 입력 변수
		Integer temp2;	//상품 번호 integer형 변수
		String Stemp;	//상품명 변수

		// 메뉴
		while (true) {		
			System.out.println("(1) 상품 등록 (2) 상품 삭제 (3) 상품 검색 (4) 전체 상품 조회 (5) 종료");
			System.out.print("메뉴 선택 : ");
			menuchoice = sc.nextInt();	//메뉴를 받는다
			if (menuchoice == 5) {		// (5) 종료가 나올때 까지 while문 반복
				break;
			} else {
				switch (menuchoice) {

				case 1:
					System.out.println("상품 등록");
					System.out.print("상품 번호 입력 : ");
					temp = sc.nextInt();
					sc.nextLine(); // nextint후 nextLine 받기위함
					temp2 = Integer.valueOf(temp); // int를 integer로
					System.out.print("상품명 입력 : ");
					Stemp = sc.nextLine();
					data.put(temp2, Stemp);		//집어 넣는다
					System.out.println("");
					break;
				case 2:
					System.out.println("상품 삭제");
					System.out.print("상품 번호 입력 : ");
					temp = sc.nextInt();
					sc.nextLine();
					temp2 = Integer.valueOf(temp);
					data.remove(temp2);		//받은 상품번호를 삭제
					System.out.println("상품 삭제 완료");
					System.out.println("");
					break;
				case 3:
					System.out.println("상품 검색");
					System.out.print("상품 번호 입력 : ");
					temp = sc.nextInt();
					sc.nextLine();
					temp2 = Integer.valueOf(temp);
					if (data.get(temp2) == null) {
						System.out.println("등록된 상품이 없습니다.");
						System.out.println("");
						break;
					}
					System.out.println("상품명 : " + data.get(temp2));
					System.out.println("");
					break;
				case 4:
					for (Integer i : data.keySet()) {
						System.out.println(i + " " + data.get(i));
					}
					if (data.isEmpty()) {
						System.out.println("등록된 상품이 없습니다.");
					}
					System.out.println("");

					break;
				case 5:
					System.out.println("프로그램 종료");
					break;
				}
			}

		}

	}

}


/*
 * 이진검색트리 삭제 코드는 아래와 같으나, 삭제 기능은 수업시간에 배운바 없고, 
 * 구글링을 하여 얻은 코드이기에 사용하지 않았습니다.
 * 그리고 풀스택 강의 시간에 사용했던 코드와 완벽히 똑같은 코드가 구글에 있었습니다.
 * https://madplay.github.io/post/binary-search-tree-in-java
 * 아래 삭제기능 코드를 그대로 사용하면 됬습니다만 다소 어려웠고
 * treemap으로 쉽게 구현해보고 싶어서 위와 같이 구현했습니다.
 * 과제에서 원하는 방식은 아니었지만 만족합니다.
 * 그리고 쉽게 하려고 했는데 생각보다 너무 오래걸려서ㅋㅋ.. 그냥 아래 코드 찬찬히 뜯어보고 쓸걸 그랬습니다...
 */






/*
 * public boolean removeNode(int element) { Node removeNode = rootNode; Node
 * parentOfRemoveNode = null;
 * 
 * while (removeNode.value != element) { parentOfRemoveNode = removeNode;
 * 
 * 삭제할 값이 현재 노드보다 작으면 왼쪽을 탐색한다. if (removeNode.value > element) { removeNode =
 * removeNode.leftChild; } else { removeNode = removeNode.rightChild; }
 * 
 * 
 * 값 대소를 비교하며 탐색했을 때 잎 노드(Leaf node)인 경우 삭제를 위한 탐색 실패
 * 
 * if (removeNode == null) return false;
 * 
 * }
 * 
 * 자식 노드가 모두 없을 때 if (removeNode.leftChild == null && removeNode.rightChild ==
 * null) { 삭제 대상이 트리의 루트일 때 if (removeNode == rootNode) { rootNode = null; }
 * else if (removeNode == parentOfRemoveNode.rightChild) {
 * parentOfRemoveNode.rightChild = null; } else { parentOfRemoveNode.leftChild =
 * null; } }
 * 
 * 오른쪽 자식 노드만 존재하는 경우 else if (removeNode.leftChild == null) { if (removeNode ==
 * rootNode) { rootNode = removeNode.rightChild; } else if (removeNode ==
 * parentOfRemoveNode.rightChild) {
 * 
 * 삭제 대상의 오른쪽 자식 노드를 삭제 대상 위치에 둔다.
 * 
 * parentOfRemoveNode.rightChild = removeNode.rightChild; } else {
 * parentOfRemoveNode.leftChild = removeNode.rightChild; } }
 * 
 * 왼쪽 자식 노드만 존재하는 경우 else if (removeNode.rightChild == null) { if (removeNode ==
 * rootNode) { rootNode = removeNode.leftChild; } else if (removeNode ==
 * parentOfRemoveNode.rightChild) { parentOfRemoveNode.rightChild =
 * removeNode.leftChild; } else {
 * 
 * 삭제 대상의 왼쪽 자식을 삭제 대상 위치에 둔다.
 * 
 * parentOfRemoveNode.leftChild = removeNode.leftChild; } }
 * 
 * 
 * 두 개의 자식 노드가 존재하는 경우 삭제할 노드의 왼쪽 서브 트리에 있는 가장 큰 값 노드를 올리거나 오른쪽 서브 트리에 있는 가장 작은
 * 값 노드를 올리면 된다. 구현 코드는 2번째 방법을 사용한다.
 * 
 * else { 삭제 대상 노드의 자식 노드 중에서 대체될 노드(replaceNode)를 찾는다. Node parentOfReplaceNode
 * = removeNode;
 * 
 * 삭제 대상의 오른쪽 서브 트리 탐색 지정 Node replaceNode = parentOfReplaceNode.rightChild;
 * 
 * while (replaceNode.leftChild != null) { 가장 작은 값을 찾기 위해 왼쪽 자식 노드로 탐색한다.
 * parentOfReplaceNode = replaceNode; replaceNode = replaceNode.leftChild; }
 * 
 * if (replaceNode != removeNode.rightChild) { 가장 작은 값을 선택하기 때문에 대체 노드의 왼쪽 자식은 빈
 * 노드가 된다. parentOfReplaceNode.leftChild = replaceNode.rightChild;
 * 
 * 대체할 노드의 오른쪽 자식 노드를 삭제할 노드의 오른쪽으로 지정한다. replaceNode.rightChild =
 * removeNode.rightChild; }
 * 
 * 삭제할 노드가 루트 노드인 경우 대체할 노드로 바꾼다. if (removeNode == rootNode) { rootNode =
 * replaceNode; } else if (removeNode == parentOfRemoveNode.rightChild) {
 * parentOfRemoveNode.rightChild = replaceNode; } else {
 * parentOfRemoveNode.leftChild = replaceNode; }
 * 
 * 삭제 대상 노드의 왼쪽 자식을 잇는다. replaceNode.leftChild = removeNode.leftChild; }
 * 
 * return true; } }
 */
