package Collection_frameworks_in_java;

import java.util.HashMap;
import java.util.Map;

public class Lec28_HashMap_With_MutableObjects {
    public static void main(String[] args) {
        System.out.println("Why key should be immutable make custom object and watch it.");
        Map<Student,String> map = new HashMap<>();

        Student s1 = new Student(1, "Jenny", 89.76);
        Student s2 = new Student(2, "Payal", 98.76);
        Student s3 = new Student(3, "Rahul", 75.50);
        Student s4 = new Student(4, "Tarun", 82.30);
        Student s5 = new Student(5, "Jai", 91.20);
        Student s6 = new Student(1, "Jenny", 89.76);


        map.put(s1,"A");
        map.put(s2,"B");
        System.out.println(map);
        map.put(s6,"C");
        System.out.println(map);
        // and we know why key should be immutable
    }
}
