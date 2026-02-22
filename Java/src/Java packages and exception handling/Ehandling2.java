package Java

public class Ehandling2 {
    public static void main(String[] args) {
        // Introduction to exception handling
        // As we know there are three types of errors in programming 
        // 1> Logical errors
        // 2> Compile-time errors
        // 3> run-time errors
        // in the runtime errors there is one point not all the run time errors exceptions
        // errors is like outOfMemoryError and stackOverflowError and noClassDefFoundError

        // example of outOfMemoryError can be
        int [] largeArray = new int[Integer.MAX_VALUE];
        // this will give outOfMemoryError


        // example of stackOverflowError can be
        errorsOFStackOverFlow obj = new errorsOFStackOverFlow();
        // obj.errorMethod();

        // example of noClassDefFoundError can be
        // this is a runtime error that occurs when the JVM tries to load a class and cannot find it
        // this can happen if the class was present at compile time but not at runtime
        // for example if you have a class called MyClass and you compile it but then delete the class file
        // and try to run the program that uses MyClass, you will get a NoClassDefFoundError


    }
}

// class errorsOFStackOverFlow{
//     void errorMethod(){
//         errorMethod();
//     }
// }