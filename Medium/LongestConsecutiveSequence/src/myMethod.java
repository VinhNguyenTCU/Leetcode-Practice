public class myMethod {
    // Check whether the given array contains the target number which is currentNum + 1.
    public static boolean arrayContains(int[] nums, int num){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        // [100, 4, 200, 1, 3, 2] --> [1, 2, 3, 4, 100, 200]
        // [0,3,7,2,5,8,4,6,0,1] --> [0, 0, 1, 2, 3, 4, 5, 6, 7, 8]
        // [9,1,4,7,3,-1,0,5,8,-1,6] --> [-1, -1, 0, 1, 3, 4, 5, 6, 7, 8, 9];

        int longestStreak = 0;
        for (int i = 0; i < nums.length; i++){
            int currentNum = nums[i];
            int currentStreak = 1;
            while (arrayContains(nums, currentNum + 1)){
                currentNum += 1;
                currentStreak += 1;
            }
            longestStreak = Math.max(longestStreak, currentStreak);
        }
        return longestStreak;
    }

    /*
     * -- Time Complexity --
     * The outer loop runs exactly n times where n is the total length of the given input array.
     * And because the current increment by one each time so the while loop runs n times, and on each time of while loop, it will
     * executes the longestConsecutive method above and also take O(n) time. 
     * 
     * --> Overall time complexity is O(n^3)
     * 
     * -- Space complexity --
     * The brute force algorithm only allocates a handful of integers, so it uses constant additional space.
     */

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int[] nums1 = {0,3,7,2,5,8,4,6,0,1};
        int[] nums2 = {9,1,4,7,3,-1,0,5,8,-1,6};
        
        System.out.println(longestConsecutive(nums));
        System.out.println(longestConsecutive(nums1));
        System.out.println(longestConsecutive(nums2));
    }
}
