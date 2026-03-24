package Collection_frameworks_in_java;

import java.util.HashMap;
import java.util.Map;

public class Lec27_HashMapWithCustomObjects {
    public static void main(String[] args) {
        Map<Integer, Map<String, Object>> map = new HashMap<>();

        Map<String, Object> studentData1 = new HashMap<>();
        studentData1.put("name", "Jenny");
        studentData1.put("age", 25);
        studentData1.put("marks", 89.76);
        studentData1.put("Address", "Delhi");

        Map<String, Object> studentData2 = new HashMap<>();
        studentData2.put("name", "Payal");
        studentData2.put("age", 23);
        studentData2.put("marks", 98.76);
        studentData2.put("Address", "Delhi");

        map.put(2, studentData1);
        map.put(1, studentData2);

        for (Map.Entry<Integer, Map<String, Object>> entry : map.entrySet()) {
            System.out.println("Rollno: " + entry.getKey());
            System.out.println("details : " + entry.getValue());
        }
    }
}
