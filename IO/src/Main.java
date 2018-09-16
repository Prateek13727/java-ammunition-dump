/* IMPORTANT: Multiple classes and nested static classes are supported */

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Main {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();  
        for(int i = 0; i < Integer.parseInt(t); i++) {
           String[] data = in.nextLine().split(" ");
           String[] arrStr = in.nextLine().split(" ");
           int[] arrInt = convertToIntegerArray(arrStr);
           System.out.println(t);
           System.out.println(data[0]);
           System.out.println(arrStr[0]);
           System.out.println(arrInt[0]);
           int minimumCost = calculateCost(arrInt, Integer.parseInt(data[0]), Integer.parseInt(data[1]));
           System.out.println(minimumCost);
        }

        in.close();
    }
    
    static int[] convertToIntegerArray(String[] arr) {
        int[] integers = new int[arr.length]; 
        // Creates the integer array.
        for (int i = 0; i < integers.length; i++){
            integers[i] = Integer.parseInt(arr[i]); 
        //Parses the integer for each string.
        }
        return integers;
    }
    
    
    static int calculateCost(int[] arr, int pos, int cost){
        int minCost = arr[0] * cost;
        for(int i = 0; i< (pos - 1); i++){
            minCost = minCost + cost*(arr[i+1] - arr[i]);
        }
        return minCost;
    }
}
