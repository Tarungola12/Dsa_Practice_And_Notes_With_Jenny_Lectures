package Java_Oops_Programs;

public class Opps15 {
    public static void main(String[] args) {
        // Abstract class

        // Abstract class lecture
        // we can't do this : person p1= new person();
        // instead of this we can do like
        person2 p1 = new student();
        p1.display();

    }
}


abstract class person2 {
    int id;

    // System.out.println("hi my name is tarun");
    abstract void display();

    // this is known as abstract method also known as non concrete method \
    // concrete method is the one which has body.
    // like that
    public void anotherDisplay() {
        System.out.println("This method is known as concrete method.");
    }

    person2(){
        System.out.println("Abstract class can have constructor.");
    }

}

class student extends person2 {
    public void display() {
        System.out.println("This is a student class method called.");
    }
}
