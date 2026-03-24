package Collection_frameworks_in_java;

import java.util.HashSet;
import java.util.Objects;

public class Lec18_HashSet {
    public static void main(String[] args) {
        System.out.println("Internally hashSet uses hashmap and store dummy values and key which we give it to it");
        HashSet<StudentClass> hashSet = new HashSet<>();
        StudentClass s1 = new StudentClass(1, "Rahul");
        StudentClass s2 = new StudentClass(2, "Priya");
        StudentClass s3 = new StudentClass(3, "Amit");
        StudentClass s4 = new StudentClass(4, "Sneha");
        StudentClass s5 = new StudentClass(5, "Karan");
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);
        hashSet.add(s5);
        // see notes nothing complex all are write in notes.

    }
}

class StudentClass {
    int id;
    String name;



    public StudentClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}