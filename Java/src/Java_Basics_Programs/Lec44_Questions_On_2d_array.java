package Java_Basics_Programs;
import java.util.Scanner;

public class Lec44_Questions_On_2d_array {
    public static void main(String[] args) {
        // int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] arr = new int[] { 0, 1 , 2, 3, 5, 6, 7, 8, 9 };
        int[][] arr1 = new int[][] { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter input in array :\n");
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // arr[i][j]=scanner.nextInt();
        // }
        // }
        // System.out.println("Your array is :\n");
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // System.out.print(arr[i][j]+" ");
        // }
        // System.out.println("\n");
        // }

        // wap program to sum all the elements in 2d array

        // int sum=0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // sum+=arr[i][j];
        // }
        // }
        // System.err.println("Sum is: \n" + sum);

        // wap to find greatest element in array

        // int highest_element = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // if (highest_element<=arr[i][j]) {
        // highest_element=arr[i][j];
        // }
        // }
        // }
        // System.err.println("highest number is : \n" + highest_element);

        // transpose of a given 2d array

        // int[][] result = new int[3][3];
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // result[j][i]=arr[i][j];
        // }
        // }

        // System.out.println("Your array after transpose is :\n");
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // System.out.print(arr[j][i]+" ");
        // }
        // System.out.println("\n");
        // }

        // wap to print multiplication of a given matrix

        // int[][] result = new int[3][3];
        // for (int i = 0; i < arr1.length; i++) {
        // for (int j = 0; j < arr1.length; j++) {
        // for (int j2 = 0; j2 < arr1.length; j2++) {
        // result[i][j]+=arr[i][j2]*arr1[j2][j];
        // }
        // }
        // }
        // for (int i = 0; i < result.length; i++) {
        // for (int j = 0; j < result.length; j++) {
        // System.out.print(result[i][j]+" ");
        // }
        // System.out.print("\n");
        // }

        // wap to print counts of total number of elememt of each row individually

        // int count=0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // count++;
        // }
        // i++;
        // System.out.println("Row number " + i + " has " + count + " element.");
        // count=0;
        // i--;
        // }

        // wap sum of each row element

        // int sum=0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // sum+=arr[i][j];
        // }
        // i++;
        // System.out.println("Row number " + i + " has " + sum + " is total sum.");
        // sum=0;
        // i--;
        // }

        // wap to reverse and array in the given array
        // int temp=0,last_element=arr.length-1;
        // for (int i = 0; i <= (arr.length)/2; i++) {
        // temp=arr[i];
        // arr[i]=arr[last_element];
        // arr[last_element]=temp;
        // last_element--;
        // }
        // for(int i=0;i < arr.length;i++){
        // System.out.print(" "+arr[i]);
        // }

        // two sum problem of leet code
        // int target, check;
        // System.err.println("Enter target number");
        // target = scanner.nextInt();
        // outer_loop : for (int i = 0; i < arr.length; i++) {
        //     check = arr[i];
        //     for (int j = i; j < arr.length - 1; j++) {
        //         if ((check + arr[j + 1]) == target) {
        //             j++;
        //             System.out.println("the value of your target is at indices of :" + i + j);
        //             break outer_loop;
        //         }
        //     }

        // }

    // wap to given array integer array nums,move all 0's to the end of while maintaining the relative order of the non-zero elements
    // note : thay you must do this is in-place without making a copy of the array

        // int temp=0,temp2=0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]==0){
        //         for (int j = i; j < arr.length-1; j++) {
        //             temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
// wap to find missing element in an array
        // int total_number=0,total_sum=0,array_sum=0;
        // total_number=arr.length;
        // total_sum=(total_number*(total_number+1))/2;
        // System.out.println(total_sum);
        // for(int i=0;i<arr.length;i++){
        //     array_sum+=arr[i];
        // }
        // System.out.println(array_sum);
        // System.out.println("Your missing number is :"+(total_sum-array_sum));

        
    }

}