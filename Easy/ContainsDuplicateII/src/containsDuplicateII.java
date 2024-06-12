import java.util.HashMap;

// myMethod
public class containsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1) return false;
        int i = 0;
        int j = 1;
        if (nums.length == 2) {
            if (nums[i] == nums[j] && j - i <= k){
                return true;
            }else{
                return false;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else if (map.containsKey(nums[i])){
                if (i - map.get(nums[i]) <= k){
                    return true;
                }else{
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        boolean result = containsNearbyDuplicate(nums, 1);
        System.out.println(result);
    }
}
