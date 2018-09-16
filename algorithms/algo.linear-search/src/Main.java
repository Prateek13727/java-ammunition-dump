public class Main {
	public static void main(String args[]){
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 7;
		arr[3] = 9;
		System.out.println(linearSearch(arr, 4));
	}

	public static int linearSearch(int[] a, int x) {
		for(int i=0; i<a.length; i++){
			if(a[i] == x){
				return i;
			}
		}
		return -1;
	}
}