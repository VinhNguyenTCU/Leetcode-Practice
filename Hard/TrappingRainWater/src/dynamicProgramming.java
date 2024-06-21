public class dynamicProgramming {
    public static int trap(int[] height){
        int ans = 0;
        int n = height.length;

        // Case of empty height array
        if (n == 0) return 0;

        // Create left and rigt max arrays
        int[] left_max = new int[n];
        int[] right_max = new int[n];

        // Find maximum height of bar from the left end upto an index i in the array left_max
        left_max[0] = height[0];
        for (int i = 1; i < n; i++){
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }

        // Find maximum height of bar from the right end upto an index i in the array right_max
        right_max[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--){
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }

        // Iterate over the height array and update ans
        for (int i = 0; i < n; i++){
            ans += Math.min(left_max[i], right_max[i]) - height[i];
        }
        
        /*
         * Time Complexity:
         * - Each for loop will take O(n) time where n is the length of given input array.
         * 
         * Space Complexity:
         * - We additionally created left_max and right_max array to store the values.
         * 
         * --> Overall: Time complexity: O(n), Space complexity: O(n)
         */
        
        return ans;
    }

    public static void main (String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
        int[] height1 = {4,2,0,3,2,5};
        System.out.println(trap(height1));
    }
}
