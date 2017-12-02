/**
 * Created by tracxn-lp-175 on 2/12/17.
 */
public class Main {
    public static void main(String args[]) {
        displayPattern(4);
    }
    public static void displayPattern(int n) {
        int max = n*(n+1);
        int min = 1;
        for(int i=0; i<n; i++) {
            String pattern = "";
            for (int k=0; k < i*2 ; k++) {
                pattern = pattern + "-";
            }
            for(int j=n; j>i; j--) {
                pattern = pattern + min + "*";
                min = min + 1;
            }
            for(int j=n; j>i; j--) {
                pattern = pattern + (max);
                max = max - 1;
                if (j == i-1) {
                    break;
                }
                pattern = pattern + "*";
            }
            System.out.println(pattern);
        }
    }
}