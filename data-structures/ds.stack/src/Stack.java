public class Stack {
	private int top;
	private int maxSize;
	private char stackArray[];

	public Stack(int size) {
		this.stackArray = new char[size];
		this.maxSize = size;
		this.top = -1;
	}

	public void push(char str) {
		if(!this.isFull()) {
			this.top++;
			this.stackArray[top] = str;	
		} else {
			System.out.println("this stack is full");
		}
	}

	public char pop() {
		if(!this.isEmpty()) {
			int old_top = this.top;
			this.top--;
  			return this.stackArray[old_top];
		} else {
			System.out.println("this stack is empty");
			return '0';
		}
	}

	public char peak() {
		return this.stackArray[top];
	}

	public boolean isEmpty() {
		return this.top == -1;
	}

	public boolean isFull() {
		return this.top == this.maxSize - 1;
	}
}