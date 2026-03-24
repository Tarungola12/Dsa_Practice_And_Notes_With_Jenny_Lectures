package Collection_frameworks_in_java;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lec22_TreeSetExploringMoreMethods {
    public static void main(String[] args) {
        System.out.println("");
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(23);
        navigableSet.add(5);
        navigableSet.add(89);
        navigableSet.add(25);
        navigableSet.add(45);
        System.out.println(navigableSet);
//        navigableSet.add(45);
//        SortedSet<Integer> sortedSet = navigableSet.subSet(23,45);
//        sortedSet.add(45);
//        System.out.println(navigableSet);
//        Error in above lines of code why so because of the range see important


    }
}
