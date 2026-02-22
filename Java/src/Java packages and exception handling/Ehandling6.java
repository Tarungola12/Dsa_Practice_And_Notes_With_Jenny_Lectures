package Java

import java.io.File;
import java.util.Scanner;

public class Ehandling6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // finally block in exception handling
        try{
            int i = 10;
            int j = 0;
            System.out.println("Enter two numbers");
            i = scanner.nextInt();
            j = scanner.nextInt();
            // this will give ArithmeticException if user enter zero but after that we have to close resources so what we can do is put that scanner.close() in finally block.
            System.out.println("The result is: " + (i / j));

        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        finally {
            if (scanner != null) {
                System.out.println("Closing scanner");
                scanner.close();
                
            }
            System.out.println("Finally block executed");
        }

    }
}
