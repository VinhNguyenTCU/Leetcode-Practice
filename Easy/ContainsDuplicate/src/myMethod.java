import java.util.HashMap;

public class myMethod {
    public static boolean containsDuplicate(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i]) + 1);
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args){
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
