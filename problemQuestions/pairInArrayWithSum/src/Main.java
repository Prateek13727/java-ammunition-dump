public class Main {
	public static void main(String[] args){
		// int[] inputArray =  { 13,17,6,10,2,19,345,90,3,4,78 };
		int[] inputArray =  { 10,2,1,6,4,8,3,5 };
		QuickSort quickSort = new QuickSort();
		quickSort.sort(inputArray, 0, inputArray.length-1);
		String[] pairs = findPairs(inputArray, 7);
		for(int i=0; i<pairs.length; i++) {
			if(pairs[i] != null) {
				System.out.print(pairs[i] + " ");	
			}
		}
	}

	public static String[] findPairs(int[] array, int sum){
		int l = 0;
		int r = array.length-1;
		String[] pairs = new String[array.length];
		int i = 0;
		while(l<r){
			if(array[l] + array[r] == sum) {
				pairs[i] = array[l] + "-" + array[r];
				i++;
				if(array[l+1] + array[r] < sum) {
					l++;
				} else {
					r--;
				}
			} 
			else if(array[l] + array[r] < sum) {
				l++;
			}
			else {
				r--;
			}
		}
		return pairs;
	} 
}
