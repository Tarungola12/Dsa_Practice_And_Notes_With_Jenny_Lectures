package java

public class Opps8 {
    public static void main(String[] args) {
        // contructor and super()
        

    }
}

class Person1 {
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person1(){
        System.out.println("NO argument constructor is called.");

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}


class students1 extends Person1{
    int id;
    String classOfStudent;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getClassOfStudent() {
        return classOfStudent;
    }
    public void setClassOfStudent(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }
    public students1(int id, String classOfStudent,String name,int age) {
        super(name,age);
        this.id = id;
        this.classOfStudent = classOfStudent;
    }
    public students1() {
        System.out.println("Default constructor is called.");
    }

}