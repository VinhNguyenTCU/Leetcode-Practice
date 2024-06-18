public class optimizedSpace {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // The left/ prefix array, we will utilize the ans array as left array.
        // int[] left = new int[n];

        // The right/ suffix array
        int[] right = new int[n];

        // Initialize the first element of ans array equals to 1
        ans[0] = 1;
        for (int i = 1; i < n; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Initialize the last element of right array equals to 1
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Multiply two left and right arrays and the product of these two arrays are the elements of the answer arrays
        for (int i = n - 1; i >= 0; i--){
            ans[i] *= right[i];
        }
        return ans;

        /*The reuslt arrays requires O(n space)
         * The right array is a scalar and does not depend on the size of the input.
         * 
         * --> Thus, the additional space complexity (excluding the output array) is O(n)
         * 
         * Space complexity: O(n) for the output array and O(1) additional space.
         */
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        for (int num : ans){
            System.out.print(num + " ");
        }
    }
}
