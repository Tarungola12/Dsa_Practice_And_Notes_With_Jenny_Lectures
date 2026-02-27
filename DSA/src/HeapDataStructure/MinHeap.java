package HeapDataStructure;

public class MinHeap {
    int [] heapArray;
    int capacity;
    int size;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.heapArray = new int[capacity];
        this.size = 0;
    }
    // Or we can say bubble up operation
    public boolean siftUp(int value){
        if(size == capacity) return false;
        this.heapArray[size] = value;
        int i = size;
        size++;
        while(i >= 0){
            if(this.heapArray[(i-1)/2] > value){
                i = swap(((i-1)/2),i);
            }
            else return true;
        }
        return true;
    }

    public void insert(int value){
        heapArray[size] = value;
        int i = size;
        size++;
        while (i!=0 && heapArray[i] < heapArray[parent(i)]){
            swap(i,parent(i));
            i = parent(i);
        }
    }



    private int parent(int i) {
        return (i-1)/2;
    }

    public int leftChild(int i){
        return 2*i+1;
    }
    public int rightChild(int i){
        return 2*i+2;
    }

    private int swap(int firstIndex, int secondIndex) {
        int temp = this.heapArray[firstIndex];
        this.heapArray[firstIndex] = this.heapArray[secondIndex];
        this.heapArray[secondIndex] = temp;
        return firstIndex;
    }

    public void display(){
//        for(int val : this.heapArray){
//            System.out.print(val+",");
//        }
        for(int i = 0;i < size;i++){
            System.out.print(this.heapArray[i]+",");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[] getHeapArray() {
        return heapArray;
    }

    public void setHeapArray(int[] heapArray) {
        this.heapArray = heapArray;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void deleteMin() {
        if(size == 0) {
            System.out.println("Min Heap is null");
            return;
        }
        swap(0,size-1);
//        heapArray[0] = heapArray[size-1];
        int i = 0;
        int minIndex = 0;
        size--;
        while (true){
            int left = leftChild(minIndex);
            int right = rightChild(minIndex);
            if(left < size && heapArray[left] < heapArray[minIndex]) minIndex = left;
            if(right < size && heapArray[right] < heapArray[minIndex]) minIndex = right;
            if(minIndex != i){
                swap(i,minIndex);
                i = minIndex;
            }
            else {
                break;
            }
        }

    }

    public void buildHeap(int[] arr, int size) {
        this.heapArray = arr;
        this.size = size;
        for(int i = 0;i < size;i++){
            insertForGivenArray(i);
        }
    }

    private void insertForGivenArray(int i) {
        while (i > 0 && heapArray[i] < heapArray[parent(i)]){
            swap(i,parent(i));
            i = parent(i);
        }
    }

    public void buildHeapInEfficientWay(int[] arr2, int size) {
        this.heapArray = arr2;
        this.size = size;
        int startIndex = (size/2)-1;
        for (int i = startIndex;i >= 0;i--){
            buildMinHeap(i);
        }
    }

    private void buildMinHeap(int i) {
        int minIndex ;
        while (true){
            int left = leftChild(i);
            int right = rightChild(i);
            minIndex = i;
            if(left<size && heapArray[left] < heapArray[minIndex]) minIndex = left;
            if(right<size && heapArray[right] < heapArray[minIndex]) minIndex = right;
            if(minIndex != i){
                swap(i,minIndex);
                i = minIndex;
            }
            else break;
        }
    }

    public void heapSort(int[] arr, int size) {
        buildHeapInEfficientWay(arr,size);
        while (this.size != 1) deleteMin();
        this.size = size;
    }
}
