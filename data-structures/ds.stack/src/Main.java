public class Main {
	public static void main(String args[]) {
		// Stack theStack = new Stack(10);
		// theStack.push(1);
		// theStack.push(2);
		// theStack.push(3);
		// System.out.println(theStack.peak());
		reverseString("Hello");
	}

	public static void reverseString(String word) {
		Stack theWordStack = new Stack(word.length());
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			theWordStack.push(ch);
		}
		// System.out.print(theWordStack.isEmpty());
		String reverseString = "";
		while(!theWordStack.isEmpty()) {
			char ch = theWordStack.pop();
			reverseString = reverseString + ch; 
		}
		System.println.out(reverseString);
	}
}