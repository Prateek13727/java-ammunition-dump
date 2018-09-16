//Circular Queue
public class Queue {
	private int rear;
	private int front;
	private int nItems;
	private int maxSize;
	private long queueArray[];

	public Queue(int size) {
		this.maxSize = size;
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
		this.queueArray = new long[size];
	}

	public void insert(int number) {
		if(rear == maxSize-1) {
			rear = -1;
		}
		rear++;
		queueArray[rear] = number;
		nItems++;
	}

	public long remove() {
		long item = queueArray[front];
		front++;
		if(front == maxSize){
			front = 0;
		}	
		nItems--;	
		return item;
	}

	public long peekFront() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == maxSize;
	}

  	public void view(){
        System.out.print("[ ");
        for(int i = 0; i < queueArray.length; i++){
            System.out.print(queueArray[i]+ " ");
        }
        System.out.print("]");
    }
}