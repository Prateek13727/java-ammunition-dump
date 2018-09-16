import java.util.*;

public class MergeSort {

	public void sort(int[] array, int startIndex, int endIndex) {
		if(startIndex >= endIndex) {
			return;
		}
		int mid = (startIndex + endIndex)/2;
		sort(array, startIndex, mid);
		sort(array, mid+1, endIndex);
		merge(array, startIndex, mid, endIndex);
	}

	private void merge(int[] array, int startIndex, int mid, int endIndex) {
		int leftSlot = startIndex;
		int rightSlot = mid+1;
		int[] tempArray = new int[endIndex - startIndex + 1];

		int k = 0;
		while(leftSlot <= mid && rightSlot <= endIndex) {
			if(array[leftSlot] < array[rightSlot]) {
				tempArray[k] = array[leftSlot];
				leftSlot++;
			} else {
				tempArray[k] = array[rightSlot];
				rightSlot++;
			}
			k++;
		}

		while(leftSlot <= mid) {
			tempArray[k] = array[leftSlot];
			leftSlot++;
			k++;
		}

		while(rightSlot <= endIndex) {
			tempArray[k] = array[rightSlot];
			rightSlot++;
			k++;
		}

		for(int i = 0; i < tempArray.length; i++) {
			array[i+startIndex] = tempArray[i];
		}
	}
}