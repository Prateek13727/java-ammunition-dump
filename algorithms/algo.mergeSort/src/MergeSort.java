public class MergeSort {
	public MergeSort() {

	}
	public static void sort(int[] arr, int start, int end) {
		if (end <= start) {
			return;
		}
		int mid = (start+end)/2;
		sort(arr, start, mid);
		sort(arr, mid+1, end);
		merge(arr, start, mid, end);
	}

	public static void merge(int[] a, int start, int mid, int end) {
		int leftSlot = start;
		int rightSlot = mid+1;
		int k = 0;

		int[] tempArray = new int[end-start+1];
		
		while(rightSlot <= end && leftSlot <= mid) {
			if(a[leftSlot] > a[rightSlot]) {
				tempArray[k] = a[rightSlot];
				rightSlot++;
			} else {
				tempArray[k] = a[leftSlot];
				leftSlot++;
			}
			k++;
		}

		if(leftSlot <= mid) {
			while (leftSlot <=mid) {
				tempArray[k] = a[leftSlot];
				k++;
				leftSlot++;
			}
		} else if(rightSlot <= end) {
			while (rightSlot <=end) {
				tempArray[k] = a[rightSlot];
				k++;
				rightSlot++;
			}
		} 		

		for(int i = 0; i<tempArray.length; i++){
			a[start+i] = tempArray[i];
		}
	}
}