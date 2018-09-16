public class Main {
	public static void main(String[] args) {
		int[] a = selectionSort(new int[] {1,6,7,9,17});
		for(int i=0; i <a.length; i++) {
			System.out.println(a[i]);
		}
	} 

	public static int[] selectionSort(int[] a) {
		for(int i=0; i<a.length; i++) {
			int minIndex = i;
			for(int j=i+1; j < a.length; j++){
				if(a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		return a;
	}
}