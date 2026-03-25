package Java_Oops_Programs;

public class Opps2 {
    public static void main(String[] args) {
        // In this lecture we will understand about the concept of oop's :

        // this keyword is use in java for point to the current referrences of the
        // object in the class.

        Rectangle obj = new Rectangle();
        // obj.setLength(5);
        // obj.setBreadth(10);
        // obj.displayDetails();

        obj.setLength(5).setBreadth(10); // that is how chaining is possible 

    }
}

class Rectangle {
    int length;
    int breadth;
    int area;

    // point is we can't use this keyword in static method :

    // public static void setLength(int length) {
    // this.length = length; // we cant make reference of this keyword inside the
    // static method
    // }

    // public void setLength(int length) {
        // this.length = length;
    // }

    // public void setBreadth(int breadth) {
        // this.breadth = breadth;
    // }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int areaOfRectangle() {
        area = length * breadth;
        return area;
    }

    public void displayDetails() {
        System.out.println("Length :" + this.length + " , Breadth : " + this.breadth + " , area : " + this
                .areaOfRectangle());
         show(this);
    }

    // Passing current object as an argument in the method
    public void show(Rectangle obj) {
        System.out.println("Passing current object as an argument.");

    }

    // Return the current object and how chaining is done in this case it is simple when we call an method which is return the object so we call one more method of that returning object like when we do obj.display.show means display returns the object and that object we perform one more operation of show that how's chaining works :

    public Rectangle setLength(int length){
        this.length = length;
        return this;
    }

    public Rectangle setBreadth(int breadth){
        this.breadth = breadth;
        return this;
    }
}