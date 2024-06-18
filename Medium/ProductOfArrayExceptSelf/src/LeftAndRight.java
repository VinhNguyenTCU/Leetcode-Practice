public class LeftAndRight {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // The left/ prefix array 
        int[] left = new int[n];

        // The right/ suffix array
        int[] right = new int[n];

        // Initialize the first element of left array equals to 1
        left[0] = 1;
        for (int i = 1; i < n; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Initialize the last element of right array equals to 1
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Multiply two left and right arrays and the product of these two arrays are the elements of the answer arrays
        for (int i = 0; i < n; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;

        /*--- Time Complexity ---
         * For loop: O(n)
         * 
         * --- Space Complexity ---
         * O(n)
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
