package Recursion;

public class Lec4_Exercise_Fibonacci_Series {
    public static void main(String[] args) {
        // Fibonaci series
        System.out.println(Fibonacci(5));
    }

    public static int Fibonacci(int term) {

        if (term == 0 || term == 1) {
            return term;
        }
        return Fibonacci(term - 1) + Fibonacci(term - 2);
    }

}

