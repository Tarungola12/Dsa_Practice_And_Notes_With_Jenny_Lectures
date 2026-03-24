package HeapDataStructure;

public class  MaxHeap {
    int capacity;
    int [] heapArray;
    int size;

    public MaxHeap(int capacity) {
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
            if(this.heapArray[(i-1)/2] < value){
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
        while (i!=0 && heapArray[i] > heapArray[parent(i)]){
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

    public void deleteMax(){
        if(size == 0){
            System.out.println("Heap is empty");
            return ;
        }
        int i = 0;
        swap(0,size-1);
//        heapArray[0] = heapArray[size-1];
        size--;
        int maxIndex = 0;
        while (true) {
            int left = leftChild(maxIndex);
            int right = rightChild(maxIndex);
            if (left < size && heapArray[left] > heapArray[maxIndex]) maxIndex = left;
            if (right < size && heapArray[right] > heapArray[maxIndex]) maxIndex = right;
            if(maxIndex != i) {
                swap(i, maxIndex);
                i = maxIndex;
            }
            else {
                break;
            }
        }
    }

    public void buildHeap(int[] arr, int size) {
        this.heapArray = arr;
        this.size = size;
        for(int i = 1;i < size;i++){
            insertIntoGivenArray(arr,i);
        }
    }

    private void insertIntoGivenArray(int[] arr, int index) {
        while (index > 0 && arr[index] > arr[parent(index)]){
            swap(index,parent(index));
            index = parent(index);
        }
    }

    public void buildHeapUsingEfficientAlgo(int [] arr , int size) {
        this.size = size;
        this.heapArray = arr;
        int startIndex = (size/2)-1;
        for (int i = startIndex;i >=0;i--){
             heapify(i);
        }

    }

    private void heapify(int i) {
        while (true){
            int maxIndex = i;
            int left = leftChild(i);
            int right = rightChild(i);
            if(left < size && heapArray[left] > heapArray[maxIndex]) maxIndex = left;
            if(right < size && heapArray[right] > heapArray[maxIndex]) maxIndex = right;
            if(maxIndex != i) {
                swap(i,maxIndex);
                i = maxIndex;
            }
            else break;
        }
    }

    public void heapSort(int[] arr, int size) {
        buildHeapUsingEfficientAlgo(arr,size);
        while (this.size != 1) this.deleteMax();
        this.size = size;
    }

}
