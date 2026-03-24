package Collection_frameworks_in_java;

import java.util.ArrayList;

public class Lec4_ArrayLIst_And_Its_Methods {
    public static void main(String[] args) {
            // Array list in java

            //Array list is a part of the collection framework and is present in java.util package.\
            //its a resizable array implementation of the list interface.
            // it can grow and shrink in size as needed.

        ArrayList<Integer> list = new ArrayList<Integer>(); // Deafult size is 10 And this have type safety.
        //ArrayList list = new ArrayList(); // this is not type safe. It can take any type of data.

        // What is AutoBoxing and UnBoxing?

        list.add(10);// AutoBoxing
        list.add(30);// AutoBoxing
        list.add(20);// AutoBoxing
        list.add(40);// AutoBoxing
        list.add(50);// AutoBoxing
        list.add(60);// AutoBoxing

        int num = list.get(0); // UnBoxing No explicit typecasting is needed.

        // ONE MOST IMPORTANT NOTE IS THAT {
        // array list does not storre any primitive data types.it stores only objects.so when we add a primitive data type to the array list, it is converted to its corresponding wrapper class object and it is known as AutoBoxing.
        // and when we retrieve the data from the array list, it is converted back to its corresponding primitive data type and it is known as UnBoxing.
        // }


        // All Below by github copilot{
        // ArrayList is not synchronized. So it is not thread safe.and not suitable for concurrent access.
        // If you want to use it in a multi-threaded environment, you can use Collections.synchronizedList() method.
        // OR you can use CopyOnWriteArrayList class which is a thread-safe variant of ArrayList.
        // OR you can use Vector class which is synchronized and thread-safe.
        // OR you can use ArrayBlockingQueue class which is a thread-safe variant of ArrayList.
        // OR you can use LinkedBlockingQueue class which is a thread-safe variant of ArrayList.
        // OR you can use ConcurrentHashMap class which is a thread-safe variant of ArrayList.
        // OR you can use CopyOnWriteArraySet class which is a thread-safe variant of ArrayList.
        // OR you can use ConcurrentSkipListSet class which is a thread-safe variant of ArrayList.
        // }


        // Now how array list is grows?
        // When we add an element to the array list, it checks if the size of the array is less than the capacity of the array. If it is less than the capacity, it adds the element to the array. If it is equal to the capacity, it creates a new array with double the size of the old array and copies all the elements from the old array to the new array and then adds the new element to the new array.
        
        // And the new capacity of the array is 1.5 times the old capacity of the array.(new capacity = old capacity * 1.5);

        //Array list use internally use array.copyof() internally to copy the elements from the old array to the new array.
        
        // frequently resizing is veru costly in terms of performance so if you know arrys list initial capacity so use initial capacity first.

        // So the time complexity of adding an element to the array list is O(1) in average case and O(n) in worst case.

    
    }
}
