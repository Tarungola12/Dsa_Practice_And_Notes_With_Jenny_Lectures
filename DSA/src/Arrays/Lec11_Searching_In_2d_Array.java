package Arrays;

public class Lec11_Searching_In_2d_Array {
    public static void main(String[] args) {
        System.out.println("In this lecture we will see how to search an element in 2d array");
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 5;
        boolean found = searchIn2DArray(arr, target);
        if (found) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

//        if array is sorted row wise then how we will search
            target = 10;
            found = searchIn2DArrayOptimized(arr, target);
            if (found) {
                System.out.println("Element " + target + " found in the array.");
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }

//         if array is sorted row wise and column wise then how we will search
            target = 8;
            found = searchIn2DArraySorted(arr, target);
            if (found) {
                System.out.println("Element " + target + " found in the array.");
            } else {
                System.out.println("Element " + target + " not found in the array.");
            }
    }

    private static boolean searchIn2DArraySorted(int[][] arr, int target) {
        int row = 0, col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) return true;
            else if (arr[row][col] > target) col--;
            else row++;
        }
        return false;
    }

    private static boolean searchIn2DArrayOptimized(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] > target || arr[i][arr[i].length - 1] < target) continue;
            boolean found = binarySearch(arr[i], target);
            if (found) return true;
        }
        return false;
    }

    private static boolean binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) return true;
            else if (array[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    // 1st way m * n
    private static boolean searchIn2DArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

}
