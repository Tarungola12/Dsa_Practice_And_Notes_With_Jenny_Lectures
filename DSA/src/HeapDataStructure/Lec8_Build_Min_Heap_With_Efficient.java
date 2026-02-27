package HeapDataStructure;

public class Lec8_Build_Min_Heap_With_Efficient {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(100);
        int[] arr2 = {9,18,12,10,20,8,6,9,5,3};
        minHeap.buildHeapInEfficientWay(arr2,arr2.length);
        System.out.println("Display the heap");
        minHeap.display();
    }
}
