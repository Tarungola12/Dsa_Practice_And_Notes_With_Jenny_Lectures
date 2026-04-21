package AlgorithmDesignAndTechniques.DivideAndConquer;

public class Lec2_BinarySearch_Using_Recursion_DAC {
    public static void main(String[] args) {
        System.out.println("In this lecture we will understand how to use binary search using recursion in divide and conquer technique");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 8;
        int ans = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);
        // now basically we are using divide and conquer technique
        // we divide and find solution


    }

    private static int binarySearch(int[] arr, int target, int low, int high) {
        if(low > high ) return -1;
        int mid = low + (high-low)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) binarySearch(arr,target,low,mid-1);
        else binarySearch(arr,target,mid+1,high);
        return -1;
    }

}
