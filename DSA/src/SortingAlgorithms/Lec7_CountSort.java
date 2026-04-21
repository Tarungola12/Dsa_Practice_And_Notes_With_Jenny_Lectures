package SortingAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lec7_CountSort {
    public static void main(String[] args) {
        System.out.println("In this lecture we will understand what is count sort and how to implement it");
        int[] arr = {15, 10, 11, 3, 1, 15, 4, 18, 25, 21};
//        int [] arr = {5,1,2,1,8,0,2,5,9,1,0,8};
            // approach : Count sort
        // find max element
        // we take count array length + 1
        // in this count array we calculate frequency of each element

        int max = findMax(arr);
        int [] count = new int[max+1];
        for (int val : arr) count[val]++;

//        countSort(arr,count); // it's not stable now we will write stable one
//        for (int val : arr) System.out.print(val + " ");

        System.out.println("answer will be : " + Arrays.toString(stableCountSort(arr,count)));
    }

    private static int[] stableCountSort(int[] arr, int[] count) {
        updateCount(count);
        int [] returnArray = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            count[arr[i]]--;
            returnArray[count[arr[i]]] = arr[i];
        }
        return returnArray;
    }

    private static void updateCount(int[] count) {
        for(int i = 1; i < count.length; i++) count[i] = count[i-1] + count[i];
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int num : arr) if(num > max) max = num;
        return max;
    }

    private static void countSort(int[] arr, int[] count) {
        // count frequency :
        for (int val : arr) count[val]++;
        int j = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] == 0) continue;
            while (count[i] != 0){
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }
}
