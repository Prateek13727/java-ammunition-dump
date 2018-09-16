public class Main {
	public static void main(String args[]){
		Queue theQueue = new Queue(4);
		theQueue.insert(1);
		theQueue.insert(4);
		theQueue.insert(3);
		System.out.println(theQueue.remove());
		theQueue.insert(2);
		System.out.println(theQueue.remove());
		System.out.println(theQueue.peekFront());
		// theQueue.insert(7);
		// theQueue.insert(10);
		// System.out.println(theQueue.peekFront());
		theQueue.view();
	}
}