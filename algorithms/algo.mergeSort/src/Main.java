public class Main {
	public static void main(String[] args){
		int[] arr = mergeSort(new int[] { 13,17,6,10,2,19 });
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] mergeSort(int[] arr) {
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr, 0, arr.length-1);
		return arr;
	}
}