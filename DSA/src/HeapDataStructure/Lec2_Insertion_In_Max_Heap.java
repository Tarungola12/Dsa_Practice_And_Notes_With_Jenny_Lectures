package HeapDataStructure;

public class Lec2_Insertion_In_Max_Heap {
    public static void main(String[] args) {
        System.out.println("Insertion in max heap");
        // what we do here is we insert at end of array and find parent and then chaneg it if needed.
        MaxHeap maxHeap = new MaxHeap(10);
//        System.out.println(maxHeap.siftUp(50));
//        System.out.println(maxHeap.siftUp(2));
//        System.out.println(maxHeap.siftUp(63));
//        System.out.println(maxHeap.siftUp(2));
//        System.out.println(maxHeap.siftUp(78));
//        System.out.println(maxHeap.siftUp(50));
//        System.out.println(maxHeap.siftUp(30));
//        System.out.println(maxHeap.siftUp(35));
//        System.out.println(maxHeap.siftUp(60));
        maxHeap.insert(50);
        maxHeap.insert(30);
        maxHeap.insert(35);
        maxHeap.insert(60);
        maxHeap.insert(55);
        maxHeap.display();
    }
}
