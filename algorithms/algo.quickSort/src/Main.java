public class Main {
	public static void main(String[] args){
		int[] inputArray =  { 13,17,6,10,2,19,345,90,3,4,78 };
		quickSort(inputArray, 0, inputArray.length-1);
		System.out.println("\n");
		for(int i=0; i <inputArray.length; i++) {
			System.out.print(inputArray[i]);
		}
	}

	public static void quickSort(int[] inputArray, int start, int end) {
		if(start >= end) {
			return;
		}
		int pivotIndex = partition(inputArray, start, end);
		quickSort(inputArray, start, pivotIndex-1);
		quickSort(inputArray, pivotIndex+1, end);
	}

	public static int partition(int [] inputArray, int start, int end) {
		int i = start-1;
		int j = start;
		int x = inputArray[end];
		while( j <= end ) {
			if(inputArray[j] <= x) {
				i += 1;
				int temp = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j] = temp;
			}
			j++;
		}
		return i;
	}

}