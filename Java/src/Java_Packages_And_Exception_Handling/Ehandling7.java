package Java_Packages_And_Exception_Handling;

import java.io.*;

public class Ehandling7 {
   public static void main(String[] args) {

      // 1> first we see how without try with resources what happens
      // FileReader file =null;
      // try {

      // file = new FileReader("test.txt"); // This file should exist

      // System.out.println("inside try block");

      // file = null; // This will cause a NullPointerException and catch by below the
      // catch block

      // System.out.println("End of try block");
      // }
      // catch (FileNotFoundException e) {
      // System.out.println("File not found: " + e.getMessage());
      // }
      // catch (NullPointerException e) {
      // System.out.println("Null pointer exception: " + e.getMessage());
      // }
      // finally {
      // System.out.println(" finally block executed");
      // try {
      // if (file != null) {
      // file.close();
      // }
      // } catch (IOException e) {
      // System.out.println("Error closing file: " + e.getMessage());
      // }

      // }

      // 2> now we see how with try with resources what happens
      // try (FileReader file = new FileReader("mytext.txt")) {

      //    System.out.println("inside try block");

      //     // This will cause a NullPointerException and catch by below the catch block

      //    System.out.println("End of try block");
      // } 
      // catch(IOException e) {
      //    System.out.println("File not found: " + e.getMessage());
      // }
      // catch (NullPointerException e) {
      //    System.out.println("Null pointer exception: " + e.getMessage());
      // }

      // finally {
      // System.out.println(" finally block executed");
      // try {
      // if (file != null) {
      // file.close();
      // }
      // } catch (IOException e) {
      // System.out.println("Error closing file: " + e.getMessage());
      // }

      // }

      // 3> cutom try with resources

      // 4>  all things we will understand by one more example let see and we will also see what is custom try with resources.

      
   }
}