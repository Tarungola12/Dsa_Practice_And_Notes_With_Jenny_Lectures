package Java_Packages_And_Exception_Handling;

public class Lec5_ThrowingAnException {
    public static void main(String[] args) {
        // throwing exception
        // checked exception are thrown by the programmer
        // but unchecked exception are thrown by the compiler and doest not need throw keyword
        methdo1 obj = new methdo1();
        try {
            obj.methods1();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
class methdo1{
    void methods1()throws Exception{
        method2.methods2();
    }
}
class method2 {
    static void methods2() throws Exception{
        throw new Exception("This is a checked exception");// this is a checked exception.
    }
}