public class CountFrequencies {
    public void findCounts(int[] arr, int size){
        int i =0;
        while(i < size) {
            if(arr[i] < 0){
                i++;
                continue;
            }
            //the index the element would have been in case it would have been sorted.
            int elementIndex = arr[i]-1;
            if(arr[elementIndex] > 0){
                arr[i] = arr[elementIndex];
                arr[elementIndex] = -1;
            } else {
                arr[elementIndex]--;
                arr[i]=0;
                i++;
             }
        }
        for(int j=0; j<arr.length; j++){
            System.out.print(j+1);
            System.out.print("-->");
            System.out.print(Math.abs(arr[j]));
            System.out.println("");
        }
    }
}