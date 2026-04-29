import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        QuestionOfStriverAtoZSheetWithVideos questionOfStriverAtoZSheetWithVideos = new QuestionOfStriverAtoZSheetWithVideos();
//        questionOfStriverAtoZSheetWithVideos.largestInArray();
//        questionOfStriverAtoZSheetWithVideos.unionOfTwoSortedArray(new int[]{1, 2, 3, 4}, new int[]{2, 3, 4, 5});
//        questionOfStriverAtoZSheetWithVideos.unionOfTwoSortedArray(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8});
//        questionOfStriverAtoZSheetWithVideos.unionOfTwoSortedArray(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
//        questionOfStriverAtoZSheetWithVideos.unionOfTwoSortedArray(new int[]{1, 2, 3, 4}, new int[]{});
//        HashMap<Long,Integer> map = new HashMap<>();
//        map.put(1L,1);
//        map.put(2L,1);
//        map.put(3L,1);
//        map.containsKey()
        int[] arr = {4, 4, 2, 1};
        Arrays.sort(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
    }
}

class QuestionOfStriverAtoZSheetWithVideos {

    public void largestInArray() {
        String h = "1234";
        char c = '1';
        Character an = h.charAt(0);
        an.toString();
        System.out.println(Integer.parseInt(String.valueOf(h.charAt(0))));
    }

    public void unionOfTwoSortedArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        list.add(arr1[0]);
        if (arr1[0] > arr2[0]) list.add(arr2[0]);
        for (int i = 0, j = 0; i < arr1.length || j < arr2.length; ) {
            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    if (arr1[i] != list.getLast()) list.add(arr1[i]);
                    i++;
                } else {
                    if (arr2[j] != list.getLast()) list.add(arr2[j]);
                    j++;
                }
            } else if (i >= arr1.length) {
                while (j < arr2.length) {
                    if (arr2[j] != list.getLast()) list.add(arr2[j]);
                    j++;
                }
            } else {
                while (i < arr1.length) {
                    if (arr1[i] != list.getLast()) list.add(arr1[i]);
                    i++;
                }
            }
        }
        System.out.println(list);

    }

}