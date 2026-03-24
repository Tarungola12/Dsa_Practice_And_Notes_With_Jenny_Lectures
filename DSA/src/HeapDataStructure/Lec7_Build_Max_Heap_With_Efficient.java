package HeapDataStructure;

public class Lec7_Build_Max_Heap_With_Efficient {
    public static void main(String[] args) {
//        In previous case we did is we start from first and then we heapify it but we know that all the leaf node we doest need to do heaify so what we do is we start from where first children node start and then start heapify till start of the array.
//        and also mam tell how this method is efficient then that and compare work done. see in notes.
        MaxHeap maxHeap = new MaxHeap(100);
        int [] arr = {3,5,9,6,8,20,10,12,18,9};
        System.out.println("After insertion the array would be : ");
        maxHeap.buildHeapUsingEfficientAlgo(arr,arr.length);
        maxHeap.display();
    }
}
