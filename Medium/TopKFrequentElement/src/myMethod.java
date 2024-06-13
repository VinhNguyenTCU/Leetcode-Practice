import java.util.HashMap;

public class myMethod {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else if (map.containsKey(nums[i]) && map.get(nums[i]) >= k){
                ans[j] = nums[i];
                j++;
            }else if(map.containsKey(nums[i]) && map.get(nums[i]) < k){
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        for (int val : ans){
            System.out.print(" " + val);
        }
    }
}
