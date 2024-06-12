import java.util.HashMap;

public class optimized {
    public static boolean containsDuplicate(int[] nums){
        if (nums.length == 1) return false;
        if (nums.length == 2){
            if (nums[0] == nums[1]){
                return true;
            }else{
                return false;
            }
        }

        for (int i = 0; i < nums.length; i++){
            int currentNum = nums[i];
            int prevIndex = i - 1;

            while (prevIndex > -1 && nums[prevIndex] > currentNum){
                nums[prevIndex + 1] = nums[prevIndex];
                prevIndex -= 1;
            }
            nums[prevIndex + 1] = currentNum;
        }

        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;

    }

    public static void main(String[] args){
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
