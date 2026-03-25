package Java_Basics_Programs;
import java.util.Scanner;

public class Lec26_forloop_question_26oct {
    public static void main(String[] args) {
        // System.out.println("For loop question.....");
        Scanner scanner = new Scanner(System.in);
      
      
// //1. WAP to print sum of first n natural numbers using for loop

        // System.out.println("Give me n number for natural sum..");
        // int i,anwser=0,number=scanner.nextInt();
        // for ( i = 0; i <= number; i++) {
        // anwser+=i;
        // }
        // System.out.println("Your sum after adding is :" + anwser);



// question 2. WAP to print factorial of a number using for loop.



        // System.out.println("Give me n number for factorial :\n ");
        // int i,anwser=1,number=scanner.nextInt();
        // for ( i = 1; i <= number; i++) {
        // anwser*=i;
        // }
        // System.out.println("Your Factorial of given number is :" + anwser);



// Question 3.WAP to print multiplication table of a number.



        // System.out.println("Give a number for print table of that given number :\n
        // ");
        // int i,anwser=1,number=scanner.nextInt();
        // for ( i = 1; i <= 10; i++) {
        // System.out.println(number + "*"+ i + "=" + number*i);
        // }




// Question 4.WAP to print sum of even numbers between 1 and N.





        // System.out.println("Give me n number for print sum of even number from 1 to
        // given number:\n ");
        // int i,anwser=0,number=scanner.nextInt();
        // for ( i = 0; i <= number; i=i+2) {
        // anwser+=i;
        // }
        // System.out.println("Your Sum of even number is :" + anwser);





// Question 5.WAP to check if a number is prime or not.




        // System.out.println("Give Me Number N To Check Whether It Is Prime Or Not :\n
        // ");
        // int i, number = scanner.nextInt();
        // boolean j=true;
        // for ( i = 2; i <= number/2; i++) {
        // if (number%i==0) {
        // System.out.println("The given number is not prime...");
        // j=false;
        // break;
        // }
        // }
        // if (j==true) {
        // System.out.println("Given number is prime...");
        // }




// Question 6.WAP to check if a number is palindrome.




        
        // System.out.println("Give a number to check whther it is palindrome or not.");
        // int check,i,answer=0,number=scanner.nextInt();
        // check=number;
        // for (; number>0 ;) {
        // answer=(number%10)+answer*10;
        // number=number/10;
        // System.out.println("answer is "+answer);
        // }
        // if (answer==check) {
        // System.out.println("Your Number is Palindrome.");
        // }
        // else{
        // System.out.println("Your number is not palindrome.");
        // }

    
    
    
// Question 7.WAP to find sum of digits of a number.





        // System.out.println("Enter your number for find their sum:");
        // int answer = 0, number = scanner.nextInt();
        // for (int i = 0; number > 0; i++) {
        //     answer += (number % 10);
        //     number = number / 10;
        // }
        // System.out.println("Your number sum is :" + answer);
    
    
    
    
// Question 8.WAP to print numbers in reverse. (E.g from 10 to 1)




        // System.out.print("Enter that number that you want to print until it become 1 like in reverse order :");
        // int number=scanner.nextInt();
        // for (int i = number; i > 0; i--) {
        //     System.out.print(","+i);
        // }




// Question 9.WAP to print first n Fibonacci numbers.



        // System.out.print("Enter numbers you want to print of fibonacci series:");
        // int a=0,b=1,number,answer;
        // number=scanner.nextInt();
        // System.out.print("0,1,");
        // for (int i = 0; i < number-2; i++) {
        //     answer=a+b;
        //     System.out.print(answer+",");
        //     a=b;
        //     b=answer;
        // }




// Question 10.WAP to find Nth Fibonacci number




        // System.out.println("Write a Term which you want to find the term of fibonacci series:");
        // int a=0,b=1,number,answer=0;
        // number=scanner.nextInt();
        // System.out.print("0,1,");
        // for (int i = 0; i < number-2; i++) {
        //     answer=a+b;
        //     // System.out.print(answer+",");
        //     a=b;
        //     b=answer;
        // }
        // System.out.println("Your term answer is :"+ answer);





// Question 11.	WAP to count digits in a number.




    // System.out.println("Enter your number count the digits:");
    // int count=0,answer = 0, number = scanner.nextInt();
    // for (int i = 0; number > 0; i++) {
    //     // answer= (number % 10);
    //     number = number / 10;
    //     count++;
    // }
    // System.out.println("Your digits are :" + count);





// Question12.	WAP to reverse a given number.





    // System.out.println("give a number for print their in the reverse form:");
    // int answer=0,number=scanner.nextInt();
    // for ( ; number >0 ; ) {
    //     answer=answer*10+number%10;
    //     number=number/10;
    // }
    // System.out.println("Your reverse is:" + answer);






// Quesiton 13.	WAP to calculate power of a number using for loop.





        // System.out.println("Give a number to find their power so what is number:");
        // int number,power,answer;
        // number=scanner.nextInt();
        // System.out.println("what is the power:");
        // power=scanner.nextInt();
        // answer=number;
        // for (int i = 1; i < power; i++) {
        //     answer=answer*number;
        // }
        // System.out.println("Your answer is "+answer);





// Quesiton 14.	FizzBuzzProgram 
        // Print numbers from 1 to n. For multiples of 3, print Fizz, for multiples of 5, print Buzz and for multiples of both print FizzBuzz.
        




        // System.out.println("Give a number to print number according to fizz and buzz:");
        // int number=scanner.nextInt();
        // for (int i = 1; i <= number; i++) {
        //         System.out.print(i+"\t");
        //         if (i%3==0||i%5==0) {
        //                 if (i%3==0&&i%5==0) {
        //                         System.out.println("FizzBuzz");       
        //                 }
        //                 else
        //                 {
        //                         if (i%3==0) {
        //                         System.out.println("Fizz");
        //                                 }
        //                         if (i%5==0) {
        //                         System.out.println("Buzz");
        //                         }    
        //         }            
        //         }
        //         else {
        //         System.out.println(i);
        //         }       
        // }


    }
}
