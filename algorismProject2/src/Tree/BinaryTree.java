package Tree;

public class BinaryTree {
	Node rootNode = null;

	public void deleteNode(int element) {
		if(rootNode == null) {
			System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
		}
		else {
			
		}
	}
	
	
	// ���ο� ��� ����
	public void insertNode(int element, String product) {
		// ��Ʈ�� �� ���, ��, �ƹ� ��嵵 ������ ��� ����
		if(rootNode == null) {
			rootNode = new Node(element, product);
		} else {
			Node head = rootNode;
			Node currentNode;
			
			while(true) {
				currentNode = head;
				
				// ���� ��Ʈ���� �������, �������� Ž��
				if(head.value > element) {
					head = head.leftChild;
					
					// ���� �ڽ� ��尡 ����ִ� ���, �ش� ��ġ�� �߰��� ��� ����
					// ���� currentNode�� head�� ����Ű�� ����
					if(head == null) {
						currentNode.leftChild = new Node(element, product);
						break;
					}
				}else { // ���� ��Ʈ���� ū ���, ���������� Ž��
					head = head.rightChild;
					
					// ������ �ڽ� ��尡 ����ִ� ���, �ش� ��ġ���߰��� ��� ����
					// ���� currentNode�� head�� ����Ű�� ����
					if(head == null) {
						currentNode.rightChild = new Node(element, product);
						break;
					}					
				}	
			}
		}
		System.out.println();
	}
	
	
	
	
	// ���� ���� (��ȸ) : root - left - right
	public void allselect(Node root, int depth) {
		if (root != null) {
			System.out.println(root.value); 			// root
			allselect(root.leftChild, depth + 1); 	// left
			allselect(root.rightChild, depth + 1); 	// right
		}
		else { System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
		}
	}	
	
	
//---------------------------------------------------------------------------
	
	
	public void select(Node root, int depth, int value) {
		if (root != null) {
			if (root.value==value) {
				System.out.println(root.value); 
				}// root
			select(root.leftChild, depth + 1, value); 	// left
			select(root.rightChild, depth + 1, value); 	// right
		}
		else { System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
		}
	}
	
	
	
	// ���� ���� (��ȸ) : left - root - right
	public void inorderTree(Node root, int depth) {
		if (root != null) {
			inorderTree(root.leftChild, depth + 1); 	// left

			for (int i = 0; i < depth; i++) {
				System.out.print("��");
			}

			System.out.println(root.value); 			// root

			inorderTree(root.rightChild, depth + 1);	// right
		}
	}
	
	// ���� ���� (��ȸ) : left - root - right
	public void postorderTree(Node root, int depth) {
		if (root != null) {
			postorderTree(root.leftChild, depth + 1); // left
			postorderTree(root.rightChild, depth + 1);// right

			for (int i = 0; i < depth; i++) {
				System.out.print("��");
			}

			System.out.println(root.value); 		   // root
		}
	}
	
	// ���� �˻�
	public void searchBTree(Node n, int target) {
		try {
			// target ���� ���� ����� ������ (n.value)���� ������ ��
			if(target == n.value) {
				System.out.println("Ÿ���� " + n.value + "���� ����");
				searchBTree(n.leftChild, target);
			} else if(target > n.value) {
				System.out.println("Ÿ���� " + n.value + "���� ŭ");
				searchBTree(n.rightChild, target);
			} else {
				System.out.println("ã����");
			}
		} catch (Exception e) {
			System.out.println("Ʈ���� ����");
		}
	}
	
	
	
	
	
	public boolean removeNode(int element) {
	    Node removeNode = rootNode;
	    Node parentOfRemoveNode = null;

	    while (removeNode.value != element) {
	        parentOfRemoveNode = removeNode;

	        /* ������ ���� ���� ��庸�� ������ ������ Ž���Ѵ�. */
	        if (removeNode.value > element) {
	            removeNode = removeNode.leftChild;
	        } else {
	            removeNode = removeNode.rightChild;
	        }

	        /*
	         * �� ��Ҹ� ���ϸ� Ž������ ��
	         * �� ���(Leaf node)�� ��� ������ ���� Ž�� ����
	         */
	        if (removeNode == null)
	            return false;

	    }

	    /* �ڽ� ��尡 ��� ���� �� */
	    if (removeNode.leftChild == null && removeNode.rightChild == null) {
	        /* ���� ����� Ʈ���� ��Ʈ�� �� */
	        if (removeNode == rootNode) {
	            rootNode = null;
	        } else if (removeNode == parentOfRemoveNode.rightChild) {
	            parentOfRemoveNode.rightChild = null;
	        } else {
	            parentOfRemoveNode.leftChild = null;
	        }
	    }

	    /* ������ �ڽ� ��常 �����ϴ� ��� */
	    else if (removeNode.leftChild == null) {
	        if (removeNode == rootNode) {
	            rootNode = removeNode.rightChild;
	        } else if (removeNode == parentOfRemoveNode.rightChild) {
	            /*
	             * ���� ����� ������ �ڽ� ��带 ���� ��� ��ġ�� �д�.
	             */
	            parentOfRemoveNode.rightChild = removeNode.rightChild;
	        } else {
	            parentOfRemoveNode.leftChild = removeNode.rightChild;
	        }
	    }

	    /* ���� �ڽ� ��常 �����ϴ� ��� */
	    else if (removeNode.rightChild == null) {
	        if (removeNode == rootNode) {
	            rootNode = removeNode.leftChild;
	        } else if (removeNode == parentOfRemoveNode.rightChild) {
	            parentOfRemoveNode.rightChild = removeNode.leftChild;
	        } else {
	            /*
	             * ���� ����� ���� �ڽ��� ���� ��� ��ġ�� �д�.
	             */
	            parentOfRemoveNode.leftChild = removeNode.leftChild;
	        }
	    }

	    /*
	     * �� ���� �ڽ� ��尡 �����ϴ� ���
	     * ������ ����� ���� ���� Ʈ���� �ִ� ���� ū �� ��带 �ø��ų�
	     * ������ ���� Ʈ���� �ִ� ���� ���� �� ��带 �ø��� �ȴ�.
	     * ���� �ڵ�� 2��° ����� ����Ѵ�.
	     */
	    else {
	        /* ���� ��� ����� �ڽ� ��� �߿��� ��ü�� ���(replaceNode)�� ã�´�. */
	        Node parentOfReplaceNode = removeNode;

	        /* ���� ����� ������ ���� Ʈ�� Ž�� ���� */
	        Node replaceNode = parentOfReplaceNode.rightChild;

	        while (replaceNode.leftChild != null) {
	            /* ���� ���� ���� ã�� ���� ���� �ڽ� ���� Ž���Ѵ�. */
	            parentOfReplaceNode = replaceNode;
	            replaceNode = replaceNode.leftChild;
	        }

	        if (replaceNode != removeNode.rightChild) {
	            /* ���� ���� ���� �����ϱ� ������ ��ü ����� ���� �ڽ��� �� ��尡 �ȴ�. */
	            parentOfReplaceNode.leftChild = replaceNode.rightChild;

	            /* ��ü�� ����� ������ �ڽ� ��带 ������ ����� ���������� �����Ѵ�. */
	            replaceNode.rightChild = removeNode.rightChild;
	        }

	        /* ������ ��尡 ��Ʈ ����� ��� ��ü�� ���� �ٲ۴�. */
	        if (removeNode == rootNode) {
	            rootNode = replaceNode;
	        } else if (removeNode == parentOfRemoveNode.rightChild) {
	            parentOfRemoveNode.rightChild = replaceNode;
	        } else {
	            parentOfRemoveNode.leftChild = replaceNode;
	        }

	        /* ���� ��� ����� ���� �ڽ��� �մ´�. */
	        replaceNode.leftChild = removeNode.leftChild;
	    }

	    return true;
	}
}
















