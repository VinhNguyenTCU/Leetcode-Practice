import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class myMethod {
    public static int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;

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


        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,1,2,3};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        for (int val : ans){
            System.out.println(val + " ");
        }
    }
}
