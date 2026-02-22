package java;
import java.util.*;

public class Lec15_project_11oct_and_14_is_QnA{
    public static void main(String[] args) {
        System.out.println("Enter your first name:");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        System.out.println("What is the next word you want to add in your name :");
        String c = sc.nextLine();
        System.out.println("After adding your name with the given keyword that will be :" + b + c);
    }
}