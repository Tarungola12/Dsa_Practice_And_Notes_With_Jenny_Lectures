package Collection_frameworks_in_java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lec6_List_Iterator {
    public static void main(String[] args) {
        // this iterator we will only can use with list only
        // we can move forward and backward in both the direction
        // we can also perform operation on that.
        List<Integer> list = new ArrayList<>(List.of(1,5,6,75,28,7));
        ListIterator<Integer> listIterator = list.listIterator();
//        while (listIterator.hasNext()){
//            Integer value = listIterator.next();
//            if(value == 5){
//                listIterator.remove();
//            }
//            System.out.print(value+" ");
//        }
//        System.out.println();
//        System.out.println(list);

        // but if we do like it gives error concurrent modification exception :
//        for(Integer i : list){
//            if(i == 1){
//                list.remove(1);
//            }
//            System.out.println(i);
//        }

        // but we can do like this :
//        while (listIterator.hasNext()){
//            Integer value = listIterator.next();
//            if(value == 5){
//                listIterator.remove();
//            }
//            System.out.print(value+" ");
//        }

        while (listIterator.hasNext()){
            Integer value = listIterator.next();
            if(value == 5){
                listIterator.add(20);
            }
            System.out.print(value+" ");
        }
    // see in notes that how add perform operation.
        // and nothing in this lecture only iterator and how methods works only this is there.
    }
}
