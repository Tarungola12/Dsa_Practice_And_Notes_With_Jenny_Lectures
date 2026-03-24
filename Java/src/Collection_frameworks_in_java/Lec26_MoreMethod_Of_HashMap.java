package Collection_frameworks_in_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lec26_MoreMethod_Of_HashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>(Map.of(1,"tarun",2,"rahul",3,"Jai"));
        System.out.println(hashMap);
//        hashMap.getKey(); it gives error because Map.Entry is inner interface
//        Set<Map.Entry<Integer,String>> entries = hashMap.entrySet();
//        for(Map.Entry<Integer,String> entry : entries){
//            if(entry.getKey() == 2){
//                entr
//
//            }
//        }

        System.out.println(hashMap);
    }
}
