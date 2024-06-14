import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class myMethod {
    public static void topKFrequent(int[] nums, int k) {
        // if (k == nums.length) return nums;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> map.get(n1) - map.get(n2)
        );

        for (int value : map.keySet()){
            heap.add(value);
            if (heap.size() > k) heap.poll();
        }

        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--){
            ans[i] = heap.poll();
        }


        System.out.println(map.toString());
        System.out.println(map.keySet().toString());
        for (int num : ans){
            System.out.print(" " + num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,1,2,3};
        int k = 2;
        topKFrequent(nums, k);
    }
}
