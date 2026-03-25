package Java_Packages_And_Exception_Handling;

import java.io.*;
import java.util.*;

public class Ehandling7_1 {
    // static Scanner scanner;

    // static void method() throws IOException {
    //     FileReader f = new FileReader("test.txt");
    //     scanner = new Scanner(f);
    //     int num1 = scanner.nextInt();
    //     int num2 = scanner.nextInt();

    //     System.out.println( num1/ num2); //If exception arise here then what would happen to the scanner object? so answer is we can use int4 and it will leadked so best practice is 

    //     // so we can do finally block to close the scanner object and file object
    //     // And also we can use try with resources to close the scanner object and file object automatically
    //     f.close();
    //     scanner.close();
    // }
    
    // So this is and example of try with resources and it will close the scanner object and file object automatically
    
    static void method() throws IOException {
    try(FileReader f = new FileReader("test.txt"); Scanner scanner = new Scanner(f)) {
        
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(num1 / num2); // If exception arise here then what would happen to the scanner object? so answer is we can use int4 and it will leadked so best practice is
        }
    }


    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println("Exception caught in main method: " + e.getMessage());
        }
        // int num4 =scanner.nextInt();//this will throw illegalstateexception


    }
}
