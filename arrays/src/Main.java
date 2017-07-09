/**
 * Created by pratp on 26/3/17.
 */

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        myIntegers= Sort(myIntegers);
        printArray(myIntegers);
    }

    public static int[] getIntegers(int size){
        int [] values = new int[size];
        for (int i=0; i < size; i++) {
            values[i] =  scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] arr) {
        System.out.println("printing");
        for (int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] Sort(int arr[]) {
        int temp;
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Boolean flag = true;
        while(flag) {
            flag = false;
            for(int j=0; j<(sortedArray.length)-1; j++) {
                if (sortedArray[j] < sortedArray[j+1]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
