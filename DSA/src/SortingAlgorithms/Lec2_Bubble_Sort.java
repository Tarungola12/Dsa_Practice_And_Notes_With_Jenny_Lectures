package SortingAlgorithms;

public class Lec2_Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {13,12,11,10,9,8,7,6,5,4,3,2,1};
        for(int i = 0; i < arr.length;i++){
            boolean flag = true;
            for (int j = 0;j < arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    flag = false;
                    swap(arr,j,j+1);
                }
            }
            if(flag) break;
        }
        for(int i : arr) System.out.print(i+" ");
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
