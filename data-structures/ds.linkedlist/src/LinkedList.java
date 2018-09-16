public class LinkedList {
	private Node first=null;
	private Node last=null;

	LinkedList() {

	}

	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}

	public void insertFirstV2(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		if(isEmpty()) {
			last = newNode;
		}
		first = newNode;
	}

	public void removeFirstNode() {
		first =  first.next;
	}

	public void removeFirstNodeV2() {
		if(first.next==null) {
			last = null;
		}
		first =  first.next;
	}

	//not that efficient since we have to traverse the entire list
	public void insertLast(int data) {
		Node currentNode = first;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		currentNode.next = newNode;
	}

	public void insertLastV2(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;	
		}
		last = newNode;
	}

	public void displayList() {
		Node currentNode = first;
		while(currentNode != null ) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.print('\n');
	}

	public void reverseLinkedList(){
		Node current = first;
		Node prev = null;
		Node next = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		first = prev;
	}

	public boolean isEmpty() {
		return first == null;
	}
}