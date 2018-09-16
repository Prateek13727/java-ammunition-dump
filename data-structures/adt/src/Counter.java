public class Counter {

	private String name;
	private int counter;

	Counter(String str) {
		this.name = str;
		this.counter = 0;
	}

	public void Increment() {
		this.counter++;
	}

	public int getCurrentValue() {
		return counter;
	}

	public String toString() {
		return name + ":" + counter;
	}
}