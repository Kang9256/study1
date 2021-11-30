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
	// pop 메서드는 왜 반환형이 char인가. push는 void인데?
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
	//클리어 메서드로 top을 -1로만 해주면, 배열에 있는 값들은 그대로인데.
	
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
