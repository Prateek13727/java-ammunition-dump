public class Main {
	public static void main(String args[]){
		LinkedList theLinkedList = new LinkedList();
		theLinkedList.insertFirstV2(2);	
		theLinkedList.insertFirstV2(4);	
		theLinkedList.insertFirstV2(5);	
		theLinkedList.insertFirstV2(7);	
		theLinkedList.insertFirstV2(9);
		theLinkedList.displayList();
		// theLinkedList.removeFirstNode();
		theLinkedList.insertLastV2(10);	
		// theLinkedList.displayList();
		// theLinkedList.removeLast();	
		theLinkedList.displayList();
		theLinkedList.reverseLinkedList();
		theLinkedList.displayList();
	}
}