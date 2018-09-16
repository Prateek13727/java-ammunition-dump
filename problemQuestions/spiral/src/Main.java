import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        input.add(inputList);
        ArrayList<Integer> spiralList = spiralOrder(input);
        for (int i = 0; i < spiralList.size(); i++) {
            System.out.println(spiralList.get(i));
        }
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int cols = A.get(0).size();
        int rows = A.size();
        ArrayList<Integer> spiral = new ArrayList<Integer>();
        int top = 0;
        int right = cols-1;
        int bottom = rows-1;
        int left = 0;
        int dir = 0;
        while(top <= bottom && left <= right) {
            if (dir == 0) {
                for(int i = left; i<= right; i++) {
                    spiral.add(A.get(top).get(i));
                }
                dir = 1;
                top++;
            } else if (dir == 1) {
                for(int i = top; i<= bottom; i++) {
                    spiral.add(A.get(i).get(right));
                }
                dir = 2;
                right--;
            } else if (dir == 2) {
                for(int i = right; i>= left; i--) {
                    spiral.add(A.get(bottom).get(i));
                }
                dir = 3;
                bottom--;
            } else if (dir == 3) {
                for(int i = bottom; i >= top; i--) {
                    spiral.add(A.get(i).get(left));
                }
                dir = 0;
                left++;
            }
        }
        return spiral;
    }
}


