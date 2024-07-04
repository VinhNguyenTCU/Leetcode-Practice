import java.util.HashSet;

public class HashSetMethod {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int longestStreak = 1;
        int currentStreak = 1;
        int currentNum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        // [9, 1, -3, 2, 4, 8, 3, -1, 6, -2, -4, 7] --> [-4, -3, -2, -1, 1, 2, 3, 4, 6, 7, 8, 9]

        for (int num : set){
            if (!set.contains(num - 1)){
                currentStreak = 1;
                currentNum = num;
                while (set.contains(currentNum + 1)){
                    currentStreak += 1;
                    currentNum += 1;
                }
            }
            longestStreak = Math.max(currentStreak, longestStreak);
        }
        return longestStreak;
    }
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int[] nums1 = {0,3,7,2,5,8,4,6,0,1};
        int[] nums2 = {9,1,4,7,3,-1,0,5,8,-1,6};
        
        System.out.println(longestConsecutive(nums));
        System.out.println(longestConsecutive(nums1));
        System.out.println(longestConsecutive(nums2));
    }
}
