public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public CircularLinkedList(){

	}

	public void insertFirst(value){
		Node newNode = new Node();
		newNode.data = value;
		newNode.next = first;
		if(isEmpty()) {
			last = newNode;
		}	
		first = newNode;
	}

	public void removeFirst(){
		if(first.next == null) {
			last = null;
		}
		first = first.next;
	}

	public void insertLast(value){
		Node newNode = new Node();
		newNode.data = value;
		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;	
		}
		last = newNode;
	}

	public void removeLast(){
		if(first.next == null) {
			first = null;
			last = null;
		} else {
			Node currentNode = first;
			while(currentNode.next != last) {
				currentNode.next = currentNode;
			}
			last = currentNode;
			last.next = null;
		}
	}

	public boolean isEmpty(){
		return first == null;
	}

	public void displayList(){
		Node currentNode = first;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}

}