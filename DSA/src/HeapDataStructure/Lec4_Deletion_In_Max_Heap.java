package HeapDataStructure;

public class Lec4_Deletion_In_Max_Heap {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(50);
        maxHeap.insert(30);
        maxHeap.insert(35);
        maxHeap.insert(60);
        maxHeap.insert(55);
        maxHeap.display();
        System.out.println();
        maxHeap.deleteMax();
        System.out.println("After deletion of root element will be");
        maxHeap.display();

    }
}
