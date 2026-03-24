package HeapDataStructure;

public class Lec6_Build_Max_And_Min_Heap_From_Given_Array {
    public static void main(String[] args) {
        // like we have array and now we increase i one by one and we know fist element consider is already heap now we do i ++ if they not satisfy head property then we do sift up operation and we created max heap using in place algorithm.
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
