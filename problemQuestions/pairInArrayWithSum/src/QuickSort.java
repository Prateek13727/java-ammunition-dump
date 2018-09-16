public class QuickSort {

	public void sort(int[] array, int start, int end){
		if(start >= end) {
			return;
		}
		int partition = partiton(array, start, end);
		sort(array, start, partition-1);
		sort(array, partition+1, end);
	}

	private Integer partiton(int[] array, int start, int end){
		int i = -1;
		int j = 0;
		int x = array[end];
		while( j < end ) {
			if(array[j] < x) {
				i += 1;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			j++;
		}
		array[j] = array[i+1];
		array[i+1] = x;
		return i+1;
	}

}