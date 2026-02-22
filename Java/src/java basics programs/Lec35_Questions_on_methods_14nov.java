package java;
// import java.util.Scanner;

// public class Lec35_Questions_on_methods_14nov {
    
    
//     // public static void multiplicationtable(int a){
//     //     for (int i = 1; i <= 10; i++) {
//     //         System.out.println(  a + " * " + i + " = " + a*i);            
//     //     }
//     // }



// //     public static void isprime(int a ){
// //         if (a<=1) {
// //             System.out.println("Its is not a prime number");
// //             return ;

// //         }
// //         for (int i = 2; i < Math.sqrt(a); i++) {
// //             if (a%i==0) {
// //                 System.out.println("The number is not prime.");
// //             return ;
// //             }            
// //         }    
// //              System.out.println("The number is prime.");
// // }




// //    public static void calculate_area_and_perimeter_of_circle(float r){
// //     if (r<0) {
// //         System.out.println("Enter wrong input.");
// //     return ;
// //     }
// //     System.out.println("Circumfrence of a circle is :" + 2*3.14*r);
// //     System.out.println("Area of a circle is :" + 3.14*r*r);

// //    }





// // public static void calculate_price(int qty,float price,boolean ismember){
// //         if(ismember=true){
// //         float totalcost=(qty*price)-(qty*price)*0.15f;
// //            System.out.println("Your Total coast is " + totalcost);
// //         }
// // }







//     public static void main(String[] args) {
//         System.out.println("Give a number ");
//         Scanner scanner = new Scanner(System.in);
//         // multiplicationtable(scanner.nextInt());
//         // isprime(scanner.nextInt());
//         // calculate_area_and_perimeter_of_circle(scanner.nextFloat());
//         // calculate_price(5, 500.50f, true);




//     }
// }





// leet code problem



// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int element,result;
//         for (int i = 0; i < nums.length; i++) {
//                 element=nums[i];
//                 for (int j = i+1; j < nums.length; j++) {
//                     if (nums[i]+nums[j]==target) {
//                         System.out.println("Your number find at :"+i+j);
//                         return new int[]{i, j};
//                     }
//                 }
//         }


//     }
// }
// class Solution {
//     public int maxArea(int[] height) {
//         int max_line;
//         for (int i = 0; i < height.length; i++) {
//             if (height[i]<height[i+1]) {
//                 max_line=height[i+1];
//             }
        
//         }       
//     }
// }



