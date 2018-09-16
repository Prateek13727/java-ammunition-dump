import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(findMin(list));
	}

    // DO NOT MODIFY THE LIST
    public static int findMin(final List<Integer> a) {
        int start = 0;
        int end = a.size() - 1;
        int mid = (start+end)/2;
        int N = a.size();
        while(start <= end) {
        	if (a.get(start) <= a.get(end)) {
            	return start;
	        } 
	        mid = (start+end)/2;
	        if(a.get((mid+1)) > a.get(mid) && a.get(mid-1) > a.get(mid)){
	            return mid;
	        } 
	        if (a.get(mid) >= a.get(start) ) {
	            start = mid+1;
	        }
			if (a.get(mid) <= a.get(end) ) {
	            end = mid-1;
	        }
        }   
        return -1;
    }
}
