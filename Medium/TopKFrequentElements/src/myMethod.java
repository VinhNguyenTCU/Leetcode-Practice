import java.util.*;

public class myMethod {
    public static int[] topkFrequent(int[] nums, int k){

        if (nums.length == 1) return new int[nums[0]];

        if (nums.length == 0) return null;

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], count);
            }else{
                int value = map.get(nums[i]);
                value += 1;
                map.put(nums[i], value);
            }
        }
        int[] arr = new int[map.size()];
        for (int i = 0; i < map.size(); i++){
            if(map.get(nums[i]) >= k){
                arr[i] += map.get(nums[i]);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(topkFrequent(nums, k).toString());
    }
}
