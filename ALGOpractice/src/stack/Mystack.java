package stack;

public class Mystack {

	private int stacksize;
	private int top;
	private char[] stackarr;
	
	public Mystack(int stacksize) {
		top= -1;
		this.stacksize = stacksize;
		stackarr= new char[this.stacksize];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top >= (stacksize-1);
	}
	
	public void push(char item) {
		if(isFull()) {
			System.out.println("stack isFull().isFull overflow");
		}
		else {
			stackarr[++top]=item;
		}
	}
	// pop �޼���� �� ��ȯ���� char�ΰ�. push�� void�ε�?
	public char pop() {
		if(isEmpty()) {
			System.out.println("stack empty, underflow");
			return 'e';
		}
		else {
			return stackarr[top--];
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("stack empty");
			return 'e';
		}
		else {
			return stackarr[top];
		}
	}
	public void clear() {
		top=-1;
	}
	//Ŭ���� �޼���� top�� -1�θ� ���ָ�, �迭�� �ִ� ������ �״���ε�.
	
	public void showStack() {
		if(isEmpty()) {
			System.out.println("stack empty");
		}
		else {
			System.out.println("stack items:");
			for(int i=0; i<= top; i++) {
				System.out.println(i + ":" + stackarr[i]+ " ");
			}
		}
	}
}
