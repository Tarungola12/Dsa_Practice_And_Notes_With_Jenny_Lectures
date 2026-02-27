package SortingAlgorithms;

public class Lec4_Selection_Sort {
    public static void main(String[] args) {
        System.out.println("Selection sort in this lecture...");
        int [] arr = {13,12,11,10,9,8,7,6,5,4,3,2,1};
        for(int i = 0;i < arr.length;i++){
            int minIndex = i;
            for(int j = i+1;j < arr.length;j++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int value : arr) System.out.print(value+" ");
    }
}
