package HeapDataStructure;

public class Lec9_Heap_Sort {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(100);
        int [] arr = {3,5,9,6,8,20,10,12,18,9};
//        System.out.println("After insertion the array would be : ");
//        maxHeap.buildHeapUsingEfficientAlgo(arr,arr.length);
//        maxHeap.display();
//        System.out.println();
//        System.out.println("Now we sort the array using heap sort");
        maxHeap.heapSort(arr,arr.length);
        System.out.println("After sorting the array would be : ");
        maxHeap.display();
        System.out.println();
        MinHeap minHeap = new MinHeap(100);
        int[] arr2 = {9,18,12,10,20,8,6,9,5,3};
        minHeap.heapSort(arr2,arr2.length);
        minHeap.display();

    }
}
