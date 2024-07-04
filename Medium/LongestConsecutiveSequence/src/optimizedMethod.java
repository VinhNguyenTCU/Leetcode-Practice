import java.util.Arrays;

public class optimizedMethod {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        // [100, 4, 200, 1, 3, 2] --> [1, 2, 3, 4, 100, 200]
        // [0,3,7,2,5,8,4,6,0,1] --> [0, 0, 1, 2, 3, 4, 5, 6, 7, 8]
        // [9,1,4,7,3,-1,0,5,8,-1,6] --> [-1, -1, 0, 1, 3, 4, 5, 6, 7, 8, 9];

        Arrays.sort(nums);
        int longestStreak = 1;
        int currentStreak = 1;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1]){
                continue;
            }

            if (Math.abs(nums[i + 1] - 1) == nums[i]){
                currentStreak += 1;
            }else{
                currentStreak = 1;
            }
            longestStreak = Math.max(currentStreak, longestStreak);
        }
        return longestStreak;

        /*
         * Time Complexity: The main for loop does contain work n times, where n is the total length of an 
         * input array. The time complexity of Arrays.sort takes O(nlogn). While O(nlogn) > O(n), so the overall
         * time complexity is O(nlogn)
         * 
         * Space Complexity: O(n) or O(logn)
         * 
         * Note that some extra space is used when we sort an array in place. The space complexity of the sorting algorithm 
         * depends on the programming language.
         * 
         *In Python, the sort method sorts a list using the Tim Sort algorithm which is a combination of Merge Sort and Insertion Sort and has O(n) additional space. Additionally, Tim Sort is designed to be a stable algorithm.
         *In Java, Arrays.sort() is implemented using a variant of the Quick Sort algorithm which has a space complexity of O(logn) for sorting an array.
         */
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
