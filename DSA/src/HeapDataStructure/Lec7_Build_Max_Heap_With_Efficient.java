package HeapDataStructure;

public class Lec7_Build_Max_Heap_With_Efficient {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(100);
        int [] arr = {3,5,9,6,8,20,10,12,18,9};
        System.out.println("After insertion the array would be : ");
        maxHeap.buildHeapUsingEfficientAlgo(arr,arr.length);
        maxHeap.display();
    }
}
