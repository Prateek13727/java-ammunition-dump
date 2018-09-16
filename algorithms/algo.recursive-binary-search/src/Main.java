public class Main {
	public static void main(String args[]){
		int[] a = new int[] {1,6,7,9,17,45,67};
		System.out.println(recursiveBinarySearch(a, 0, a.length-1, 97));
	}

	public static int recursiveBinarySearch(int[] a, int start, int end, int x) {
		System.out.println(" Looking between [" + start + "...." + end + "]"); 
		int center = (start+end)/2;
		if(start > end) return -1;
		else if(a[center] < x) return recursiveBinarySearch(a, center+1, end, x);	
		else if (a[center] > x) return recursiveBinarySearch(a, start, center-1, x);
		else return center; 
	}
}