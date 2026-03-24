package HeapDataStructure;

public class Lec3_Insertion_In_Min_Heap {
    public static void main(String[] args) {
        // same method first we insert and then check value with parent and shift it with it.
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(10);
        minHeap.insert(58);
        minHeap.insert(55);
        minHeap.insert(44);
        minHeap.insert(42);
        minHeap.display();
    }
}
