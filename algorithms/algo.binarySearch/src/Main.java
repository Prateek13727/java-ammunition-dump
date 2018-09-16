public class Main {
	public static void main(String args[]){
		System.out.println(binarySearch(new int[] {1,6,7,9,17}, 9));
	}

	public static int binarySearch(int[] a, int x) {
		int start = 0;
		int end = a.length -1;
		while (start <= end) {
			int center = (end+start)/2;
			if (x > a[center]) start = center + 1;
			else if (x < a[center]) end = center - 1;
			else return center;
		}
		return -1;
	}
}