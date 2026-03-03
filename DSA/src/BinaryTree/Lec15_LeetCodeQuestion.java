package BinaryTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lec15_LeetCodeQuestion {
    public static void main(String[] args) {
        System.out.println("leet code number 145 ");
//        BinaryTree2 binaryTree2 = new BinaryTree2();
//        BinaryTree2.preOrder();
        int [] nums = {1,2,5,2,3};
        int target = 2;
        Solution solution = new Solution();
//        List<Integer> list = solution.targetIndices(nums,target);
        int number = solution.binarySearch(nums,target);
//        System.out.println(list);
        System.out.println(number);
    }
}

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        binarySearch(nums,target);
        return null;
    }
    public int binarySearch(int [] nums,int target){
        Arrays.sort(nums);
        int low = 0,high = nums.length-1, mid = low+((high-low)/2);
        while(low <= high){
            mid = low+((high-low)/2);
            if(nums[mid] == target) high = mid - 1;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return high+1;
    }
}

