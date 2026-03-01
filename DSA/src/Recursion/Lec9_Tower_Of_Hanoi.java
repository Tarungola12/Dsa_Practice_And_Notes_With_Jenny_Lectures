package Recursion;

public class Lec9_Tower_Of_Hanoi {
    public static void main(String[] args) {
        System.out.println("Tower of hanoi problem :");
        System.out.println("Hindu temple story see for knowledge");
        
    }

    public static void towerOfHanoi(int n,char s,char h,char d){
        if(n==0)return;
        towerOfHanoi(n-1,s,d,h);
        System.out.println("Move from " + s + " to destination " +d);
        towerOfHanoi(n-1,h,s,d);
    }
}
