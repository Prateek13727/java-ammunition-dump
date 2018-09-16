public class Main {
	public static void main(String[] args) {
		int[] a = insertionSort(new int[] {37,6,27,9,17});
		for(int i=0; i <a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}

	public static int[] insertionSort(int[] a) {
		for(int i = 1; i < a.length-1; i++) {
			int element = a[i];
			int j = i-1;
			while (j>=0 && element<a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = element;
		}
		return a;
	} 
}