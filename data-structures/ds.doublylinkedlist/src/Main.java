public class Main {
	public static void main(String args[]){
		DoublyLinkedList theLinkedList = new DoublyLinkedList();
		theLinkedList.insertFirst(2);	
		theLinkedList.insertFirst(4);	
		theLinkedList.insertFirst(5);	
		theLinkedList.insertFirst(7);	
		theLinkedList.insertFirst(9);
		theLinkedList.displayList();
		// theLinkedList.removeFirstNode();
		// theLinkedList.insertLast(10);	
		// theLinkedList.deleteLast();	
		theLinkedList.insertAfter(7, 12);
		theLinkedList.displayList();
		theLinkedList.deleteKey(4);	
		theLinkedList.displayList();
		theLinkedList.deleteKey(2);	
		theLinkedList.displayList();
		theLinkedList.deleteKey(9);
		theLinkedList.displayList();
	}
}