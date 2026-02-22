package java;
import java.io.IOException;
import java.util.Scanner;

public class Lec13_input_output_6oct{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name : ");
        // // String a =sc.next();
        // String a =sc.nextLine();
        // System.out.println("Your given name is: "+ a);
        
        // hasnextint
        boolean b=sc.hasNextInt();
        System.err.println(" b= " +b);
        // int x=System.in.read() ;
        // System.out.println("Value of x is : " + x);

        // int a;
        // a=sc.nextInt();
        // a+=10;
        // System.out.println("Your entered number after adding 10 is : " + a);
    }
}