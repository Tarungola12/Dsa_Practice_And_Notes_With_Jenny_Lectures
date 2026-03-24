package Collection_frameworks_in_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Lec5_Iterator_Traversing_ArrayList {
    public static void main(String[] args) {
        // Iterator traversing array list
//        iterator is not index like i in for loop for-each loop internally it using iterator for traverse the list example :
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
//        for(int i : arrayList){
//            System.out.println(i);
//        }
        // it above uses iterator for traversing
//        now if we do chnage means we delete and traverse then we get exception but in if we use iterator then we don't get but i said for-each using iterator internally so why it gives exception because it maintain a mod count if we add or remove then mode count will be ++ and if we use for each then first it check is modcount == exceptedMode count then ok if not it throw exception

//        for(int i : arrayList){
//            if(i == 30) arrayList.remove(Integer.valueOf(30));
//        }

//            but if we use iterator then it will not happening
//        System.out.println(arrayList);
//        Iterator<Integer> itr = arrayList.iterator();
//        while (itr.hasNext()){
//            Integer value = itr.next();
//            if(value == 20){
//                itr.remove();
//            }
//        }
//        System.out.println(arrayList);
//

//        whatever class is if its implement iterator interface then we can use for each otherwise not like these :
        JennyCollection jennyCollection = new JennyCollection();
//        for (String s : jennyCollection)){
//            System.out.println(s);
//        }
        // so see we can't use but we can do like these
//        for (String s : jennyCollection.getData())){
//            System.out.println(s);
//        }

//        so after implement Iterable interface
        for (String s : jennyCollection){
            System.out.println(s);
        }
        Iterator<String> itr = jennyCollection.iterator();
        System.out.println();
        while (itr.hasNext()){
            String value = itr.next();
            System.out.print(value+" ");
        }

        // also tell about foreach() of iterable interface
//        now
        while (itr.hasNext()){
            Integer value = Integer.valueOf(itr.next());
            if(value == 20){
                itr.remove();
                itr.remove(); // this will gives exception beacuse next call hoga wo value tabhi remove call hoga otherwise nhi
            }
        }
    }
}

class JennyCollection implements Iterable<String>{
    private String[] data = {"c", "c++", "java"};

    public String[] getData() {
        return data;
    }

    @Override
    public Iterator<String> iterator() {
        return Arrays.asList(data).iterator();
    }
}