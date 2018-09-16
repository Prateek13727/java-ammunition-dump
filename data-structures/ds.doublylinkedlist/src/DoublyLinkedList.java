class DoublyLinkedList {
	Node first;
	Node last;

	DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		if (isEmpty()) {
			last = newNode;
		} else {
			first.previous = newNode;
		}		
		first = newNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}


	public boolean isEmpty() {
		return first == null;
	}

	//assuming non-empty list
	public void deleteFirst() {
		if(first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
	}

	//assuming non-empty list
	public void deleteLast() {
		if(last.previous == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
	}

	//assuming non-empty list
	public boolean insertAfter(int key, int data) {
		Node currentNode = first;
		while(currentNode.data != key){
			currentNode = currentNode.next;
			if(currentNode == null) {
				return false;
			}
		}

		Node newNode = new Node();
		newNode.data = data;

		if(currentNode == last) {
			last = newNode;
		} else {
			newNode.next = currentNode.next;
			currentNode.next.previous = newNode;
		}
		newNode.previous = currentNode;
		currentNode.next = newNode;
		
		return true;
	}


	//assuming non-empty list
	public boolean deleteKey(int key) {
		Node currentNode = first;
		while(currentNode.data != key){
			currentNode = currentNode.next;
			if(currentNode == null) {
				return false;
			}
		}
		if (currentNode == last) {
			last = currentNode.previous;
		} else {
			currentNode.next.previous = currentNode.previous;
		}

		if ( currentNode == first) {
			first = currentNode.next;
		} else {
			currentNode.previous.next = currentNode.next;
		}

		return true;
	}

	public void displayList() {
		Node currentNode = first;
		while(currentNode != null){
			System.out.print(currentNode.data);
			currentNode = currentNode.next;
		}
		System.out.println("\n");
		System.out.println(last.data);
		System.out.println(first.data);
	}


}