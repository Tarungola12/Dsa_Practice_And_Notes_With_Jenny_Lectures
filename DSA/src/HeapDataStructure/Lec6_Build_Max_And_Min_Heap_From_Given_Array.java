package HeapDataStructure;

public class Lec6_Build_Max_And_Min_Heap_From_Given_Array {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(100);
        int [] arr = {3,5,9,6,8,20,10,12,18,1};
//        maxHeap.display();
        System.out.println("After insertion the array would be : ");
        maxHeap.buildHeap(arr,arr.length);
        maxHeap.display();

        MinHeap minHeap = new MinHeap(100);
        System.out.println("After insertion the array would be: ");
        int[] arr2 = {9,18,12,10,20,8,6,9,5,3};
        minHeap.buildHeap(arr2,arr.length);
        minHeap.display();
    }
}
