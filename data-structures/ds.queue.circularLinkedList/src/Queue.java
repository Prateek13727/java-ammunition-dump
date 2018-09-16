class Queue {
	Node front;
	Node rear;
	int maxSize;
	int nItems;

	public Queue(int size) {
		int maxSize = size;
		int nItems = 0;
	}

	public void insert(int value) {
		Node newNode = new Node();
		newNode.data = value;
		if(isEmpty()){
			front = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;
		nItems++;
	}

	public int remove() {
		if(isEmpty()){
			return -1;
		}
		if(front.next == null) {
			rear = null;
		}
		int value = front.data;
		front = front.next;
		nItems--;
		return value;
	}

	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == maxSize;
	}

	public int peekFront() {
		return front.data;
	}

	public void view() {
		System.out.println("\n");
		Node currentNode = front;
		while(currentNode !=null){
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
}
