package SortingAlgorithms;

public class Lec3_Insertion_Sort {
    public static void main(String[] args) {
        System.out.println("Insertion sort");
        int [] arr = {13,12,11,10,9,8,7,6,5,4,3,2,1};
        int j = 0;
        for(int i = 0;i < arr.length;i++){
            int temp = arr[i];
            for(j = i;j > 0;j--){
                if(arr[j-1] > temp){
                    arr[j] = arr[j-1];
                }
            }
            arr[j] = temp;
        }
        for(int i : arr) System.out.print(i+" ");



    }
}
