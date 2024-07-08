public class myMethod {
    public static int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int ans = 0;
        
        /*
         * Check edge cases: 
         * If the last element is greater than the first element, then the array is 
         * sorted 1 cycyle. 
         * 
         * For example: 11 13 15 17 --> rotated 4 times --> 11 13 15 17
         */
        if (n == 1) return nums[left];
        if (nums[right] > nums[left]) return nums[left];


        while (left < right){
            int middle = (left + right) / 2; // Find the middle index

            /*
             * If the middle number is greater than the first number, then we should look for 
             * the inflection point of the right side of the middle index
             */
            if (nums[middle] > nums[left]){ 
                left = middle;
            }


            /*
             * If the middle number is smalelr than the first number, then we should look for 
             * the inflection point of the left side of the middle index
             */
            if (nums[middle] < nums[left]){
                right = middle;
            }

            /*
             * After finding the inflection points where left and right are 2 consecutive indices, then we compare 
             * whether the left is greater or smaller than the right, return the smalelr value
             */
            if (nums[left] > nums[left + 1]) {
                ans = nums[left + 1];
                break;
            }
            if (nums[right] < nums[right - 1]) {
                ans = nums[right];
                break;
            }
        }
        return ans;

        /*
         * Time Complexity: O(logn)
         * 1. Check edge case takes O(1)
         * 2. Binary search the inflection points takes O(logn)
         * 
         * Space Complexity: O(1)
         * 1. Storing left, right index and nums.length in constant space
         * 2. 
         */
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}
