package Collection_frameworks_in_java;

public class Lec2_Collection_Interface_And_Its_Methods {
    public static void main(String[] args) {
        // Collection interface

        // java.util.Collection is the root interface in the collection hierarchy. {Excluding MAP}

        // it defines basic functionalities that all collections should have.

        // collection is a interace and collections is a class

        // method in the interface

        //size() - returns the number of elements in the collection.
        //isEmpty() - returns true if the collection is empty, false otherwise.
        //add(E e) - adds the specified element to the collection.
        //addAll(Collection<? extends E> c) - adds all elements in the specified collection to this collection.
        //remove(Object o) - removes the specified element from the collection.
        //removeAll(Collection<?> c) - removes all elements in the specified collection from this collection.
        //clear() - removes all elements from the collection.
        //retainAll(Collection<?> c) - retains only the elements in this collection that are also in the specified collection.  
        //boolean contains(Object o) - returns true if the collection contains the specified element, false otherwise.
        //boolean containsAll(Collection<?> c) - returns true if this collection contains all elements in the specified collection, false otherwise.
        //equals(Object o) - returns true if this collection is equal to the specified object.
        //iterator<E> iterator() - returns an iterator over the elements in this collection.

    }
    
}
