package Collection_frameworks_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lec12_CollectionSort {
    public static void main(String[] args) {
        System.out.println("Collection.sort() and what is comparator and comparable interface");
        List<Integer> list = new ArrayList<>(List.of(24,58,26,75,593,1,52,20,892,-2));
        System.out.println(list);
        // in this we pass list and that
        Collections.sort(list); //this is called internally our list.sort and pass null go and check it.
        // here we pass comparator for compare two object which is an integer.
//        list.sort((num1,num2) -> num2.compareTo(num1)); // for descending order
//        list.sort((num1,num2) -> num1.compareTo(num2)); // for ascending order
        System.out.println(list);

        // we can also make custom class and implement comparable interface for compare to method and we pass our class object directly to the Collection.sort() method


        List<Student> list1 = new ArrayList<>(List.of(new Student(3,"arjun",45.9),new Student(1,"tarun",20.5),new Student(4,"piyush",78.2)));
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}

class Student implements Comparable<Student>{
    int rollNo;
    String name;
    double marks;


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo-o.rollNo;
    }
}
