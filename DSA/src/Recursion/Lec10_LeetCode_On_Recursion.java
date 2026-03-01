package Recursion;

public class Lec10_LeetCode_On_Recursion {
    public static void main(String[] args) {
        System.out.println("LeetCode question : 50 ");
        double answer = Solution.recursionOfMyPow(2,3);
        double answer2 = Solution.recursionOfMyPow(2,10);
        double answer3 = Solution.recursionOfMyPow(2,20);
        double answer4 = Solution.recursionOfMyPow(2,30);
        System.out.println(answer);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
    }
}

class Solution {
    public double myPow(double x, int n) {
        if(x == 1){
            return 1.0;
        }
        if(n < 0) return 1/recursionOfMyPow(x,n);
        else{
            return recursionOfMyPow(x,n);
        }
    }

    public static double recursionOfMyPow(double x,int n){
        if(n == 1.0) return x;
        return x * recursionOfMyPow(x, n-1);
    }

}