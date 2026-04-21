import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
//        int [] nums = {};
//        int [] nums2 = {0,5};
//        System.out.println(nums2.length);
//        System.out.println(nums.length);

//            Integer a = 1253;
//            String ofa = a.toString();
//
//        System.out.println(ofa.length());
//
//        System.out.println(a.toString());
//        System.out.println();

//        int [] arr = {2,95,72,85,92,78,21,8,2,8,18,96,-5,-1,-2,-2,175,2,-2,8,255,5,-422,-22,-55,5};
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(arr.length);
//        HashMap hashMap = new HashMap();
//        String s = "onetwo";
//        Solution solution = new Solution();
//        System.out.println(solution.originalDigits(s));
//        HashMap<Integer,Integer> h = new HashMap<>();
        String s = "/home//foo/";
//        String [] arr = s.split("/");
//        Stack<String> stack = new Stack<>();
//        for(String str : arr){
//            if(str.equals("") || str.equals(".")) continue;
//            else if(str.equals("..")){
//                if(!stack.isEmpty()) stack.pop();
//            }else stack.push(str);
//        }
//        StringBuilder answer = new StringBuilder();
//        for(String str : stack) System.out.println(str);
//        for(String str : stack) answer.append("/").append(str);
//        if(answer.length() == 0) answer.append("/");
//        System.out.println(answer.toString());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(10);
        pq.add(20);
        System.out.println(pq);
        int [] a = {1,2,3,4,5};
        int [] b = {1,2,3,4,5};
        int [] h = {1,2,1,2,1,2,3,1,3,3,3,3,2,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : h) map.put(i, map.getOrDefault(i, 0) + 1);
        System.out.println(map);
        List<Integer> [] fre = new ArrayList[5];
        for(int i = 0; i < fre.length; i++) fre[i] = new ArrayList<>();
    }

}

class Solution {
    public String originalDigits(String string) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> freq = new HashMap<>();
        char[] chars = {'e','g','f','i','h','o','n','s','r','u','t','w','v','x','z'};
        for (char ch : chars) freq.put(ch, 0);
        for (char ch : string.toCharArray()) if (freq.containsKey(ch)) freq.put(ch, freq.get(ch) + 1);

        int e = freq.get('e');
        int g = freq.get('g');
        int f = freq.get('f');
        int i = freq.get('i');
        int h = freq.get('h');
        int o = freq.get('o');
        int n = freq.get('n');
        int s = freq.get('s');
        int r = freq.get('r');
        int u = freq.get('u');
        int t = freq.get('t');
        int w = freq.get('w');
        int v = freq.get('v');
        int x = freq.get('x');
        int z = freq.get('z');

        while(true){
            if(z >= 1 && e >= 1 && r >= 1 && o >= 1){
                answer.append("0");
                z--; e--; r--; o--;
            }
            else if(o >= 1 && n >= 1 && e >= 1){
                answer.append("1");
                o--; n--; e--;
            }else if(t >= 1 && w >= 1 && o >= 1){
                answer.append("2");
                t--; w--; o--;
            }else if(t >= 1 && h >= 1 && r >= 1 && e >= 2 ){
                answer.append("3");
                t--; h--; r--; e = e - 2;
            }else if(f >= 1 && o >= 1 && u >= 1 && r >= 1){
                answer.append("4");
                f--; o--; u--; r--;
            }else if(f >= 1 && i >= 1 && v >= 1 && e >= 1){
                answer.append("5");
                f--; i--; v--; e--;
            }else if(s >= 1 && i >= 1 && x >= 1){
                answer.append("6");
                s--; i--; x--;
            }else if(s >= 1 && e >= 2 && v >= 1 && n >= 1){
                answer.append("7");
                s--; e--; v--; e--; n--;
            }else if(e >= 1 && i >= 1 && g >= 1 && h >= 1 && t >= 1){
                answer.append("8");
                e--; i--; g--; h--; t--;
            }else{
                if(n >= 2 && i >= 1 && e >=1){
                    answer.append("9");
                    n = n-2; i--; e--;
                }else break;
            }
        }
        return answer.toString();
    }
}
