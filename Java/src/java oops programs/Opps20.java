package java

interface Animal {
    public abstract void eat();

    public abstract void sleep();

    public abstract void makeSound();
    private void eat1() {
        System.out.println("private method in makeSound interface.");
    }
    default void eat2() {
        System.out.println("this method can call the private method in the interface.");
        eat1();
    }
    // public abstract this is an optional becoz its an default behaviour of these
    // interfaces

    // But we can also define the methods in the interface as default methods and
    // private methods.
    // Static method can also since java 8.


}
interface Animal1 {
    default void eat(){
        System.out.println("animal eating food interface1");
    }

    default void sleep(){
        System.out.println("animal sleeping in the sun rays interface1");
    }

    default void makeSound(){
        System.out.println("animal making sound interface1");
    }
}


// we can do like that
// public interface Animal {
    // but we can do
    // public interface Animal
    
    class cat implements Animal,Animal1 {
        public void eat(){
            
        }
        public void sleep() {
            System.out.println("cat sleeping in the sun rays");
        }
        
        public void makeSound() {
            System.out.println("cat meow meow");
        }
    }
    
    class dog implements Animal {
        public void eat() {
            System.out.println("dog eating bone");
        }
        
        public void sleep() {
            System.out.println("dog sleeping in the sun rays");
        }
        
        public void makeSound() {
            System.out.println("dog bark bark");
        }
    }
    
    class cow implements Animal {
        public void eat() {
            System.out.println("cow eating grass");
        }
        
        public void sleep() {
            System.out.println("cow sleeping in the sun rays");
        }
        
        public void makeSound() {
            System.out.println("cow moo moo");
        }
        
    }
    
    public class Opps20 {
        public static void main(String[] args) {
            // Introduction to interface in Java.
    
        }
    
    }