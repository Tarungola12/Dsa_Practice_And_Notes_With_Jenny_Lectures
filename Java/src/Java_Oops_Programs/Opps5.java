package Java_Oops_Programs;

public class Opps5 {
    public static void main(String[] args) {
        // This lecture is on coding excersise on constructor
        book obj = new book();
        System.out.println(obj);
    }
}

class person1 {
    String name;
    int age;
    char gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    person1(String name, int age, char gender) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

}

class book {
    String title;
    String author;
    float price;

    book() {
        this("unkown", "unknown");
        // this.title = title;
        // this.author = author;
        this.price = 0.0f;
        System.out.println("default constructor called.");
    }

    book(String title, String author) {
        this(title, author, 00f);
        this.author = author;
        this.title = title;
    }

    book(String title, String author, float price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "title is :" + title + " authod is :" + author + " price is : " + price;
    }
}

class product{
    String productName;
    int productId;
    double discount;
    double price;
    product(){
        this.productId = 0;
        this.discount = 0.0;
        this.price = 0.0;
        this.productName = null;
    }
    product(String productName,int productId){
        this.productId = productId;
        this.productName = productName;
        this.discount = 0.0;
        this.price = 0.0;
    }
    product(String productName,int productId,double discount,double price){
        this.productId = productId;
        this.productName = productName;
        this.discount = discount;
        this.price = price;
    }

    public void calculateDiscountPrice(){
        double discountPrice = price - ((price /100)*discount);
        System.out.println("Final pice after discount is : " + discountPrice);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Product name is: " + productName + " Procuct id is : " + productId + " discount on product is : " +  discount + " price is : " + price ;
     }   
}