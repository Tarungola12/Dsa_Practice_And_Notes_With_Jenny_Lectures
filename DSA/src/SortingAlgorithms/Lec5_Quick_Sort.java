package SortingAlgorithms;

public class Lec5_Quick_Sort {

    public static void quickSort(int[] arr,int start,int end){
        int pivot = start;
        int high = end;
        if(start >= end){
            return;
        }
        while (start<=end){
            if(arr[pivot] >= arr[start]) start++;
            else if(arr[pivot] < arr[end]) end--;
            else {
                swap(arr,start,end);
            }
        }
        swap(arr,pivot,end);

        quickSort(arr,0,end-1);
        quickSort(arr,start,high);
    }

    public static void swap(int [] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {13,12,11,10,9,8,7,6,5,4,3,2,1};
//        int [] arr = {6,7,70,3,2,90,45,2};
        quickSort(arr,0,arr.length-1);
        for (int value : arr) System.out.print(value+" ");
    }
}
