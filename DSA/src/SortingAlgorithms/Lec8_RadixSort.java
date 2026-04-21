package SortingAlgorithms;

import static SortingAlgorithms.Lec7_CountSort.findMax;

public class Lec8_RadixSort {
    public static void main(String[] args) {
        System.out.println("We will se radix sort and implementation");
        int[] arr = {15, 10, 11, 3, 1, 15, 4, 18, 25, 21};
//        int [] arr = {5,1,2,1,8,0,2,5,9,1,0,8};
        int max = findMax(arr);
        for(int place = 1; max/place > 0; place *= 10) countSort(arr,place);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }

    private static void countSort(int[] arr, int place) {
        int [] count = new int[10];
        for(int i = 0; i < arr.length; i++) count[(arr[i]/place)%10]++;
        for(int i = 1; i < count.length; i++) count[i] = count[i-1] + count[i];
        int [] output = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            output[--count[(arr[i]/place)%10]] = arr[i];
        }
        for(int i = 0; i < output.length; i++) arr[i] = output[i];
    }


}
