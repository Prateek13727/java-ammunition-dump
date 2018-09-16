public class Main {
	public static void main(String[] args){
		Heap heap = new Heap();
		heap.insert(70,"twenty");
		heap.insert(48,"forty-eight");
		heap.insert(50,"fifty");
		heap.insert(16,"sixteen");
		heap.insert(9,"nine");
		heap.insert(8,"nine");
		heap.insert(100,"nine");
		heap.delete(8);
		heap.displayHeap();
	}
}