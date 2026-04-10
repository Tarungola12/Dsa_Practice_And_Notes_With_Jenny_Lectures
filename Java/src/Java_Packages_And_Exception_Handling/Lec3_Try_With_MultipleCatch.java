package Java_Packages_And_Exception_Handling;

import java.util.Scanner;

public class Lec3_Try_With_MultipleCatch {
    public static void main(String[] args) {
        // try with multiple catch block
        int i=0,j=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        try {
            i = scanner.nextInt();
            j = scanner.nextInt();
            System.out.println("The result is: " + (i / j));
            int[] arr = new int[5];
            System.out.println("Enter value for arrays value :");
            for (int k = 0; k < arr.length; k++) {
                arr[k] = scanner.nextInt();
            }
            System.out.println("Array values are:");
            for(int k = 0; k < arr.length; k++) {
                System.out.println(arr[k]);
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed");
        }


    }
}
