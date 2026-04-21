package SortingAlgorithms;

public class Lec6_Merge_Sort {
    public static void main(String[] args) {
        System.out.println("In this lecture we will understand how merge sort works and how to implement it");
        int[] arr = {15, 10, 11, 3, 1, 15, 4, 18, 25, 21};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] arr, int low, int high, int[] temp) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid, temp);
            mergeSort(arr, mid + 1, high, temp);
            merge(arr, low, mid, high, temp);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high, int[] temp) {
        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
//                or we can do like :
//                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while (i<=mid) temp[k++] = arr[i++];
        while (j<=high) temp[k++] = arr[j++];
        for(i = low; i < k;i++) arr[i] = temp[i];

    }


}
