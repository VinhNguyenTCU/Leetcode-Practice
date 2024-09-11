public class NegativeMarkingSolution {

    /*
     * Intuition: There are n + 1 positive numbers in the array (nums) (all in the range [1,n]). Since the array only contains
     * positive integers, we can track each number (num) that has been sene before by flipping the sign of the number locate at index |num|, where 
     * || denotes absolute value.
     *
     */

     /*
      * Algorithm: 
       1. Iterate over the array, evaluating each element 
       2. Since we use negative marking, we must ensure that the current element cur is positive. If cur is negative, then use its absolute value.
       3. Check if the nums[curr] is negative.
            - If it is, then we have already performed this operation for the same number, and hence cur is the duplicate number. Store cur as the duplicate and exit the loop.
            - Otherwise, flip the sign of nums[cur] (i.e. make it negative). Move to the next element and repeat step 3.

       4. Once we've identified the duplicate, we could just return the duplicate number. However, even though we were not able to meet the problem constraints, we can show that 
       we are mindful of the constraints by restoring the array. This is done by changing all negative numbers to positive.
      * 
      */
    public int findDuplicate(int[] nums) {
        int duplicate = -1;

        for (int i = 0; i < nums.length; i++){
            int current = Math.abs(nums[i]);

            if (nums[current] < 0){
                duplicate = current;
                break;
            }

            nums[current] *= -1;
        }

        // Restore the give array
        for (int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(nums[i]);
        }

        return duplicate;
    }

    /*
     * Time Complexity: O(n) traversing through the nums array. Each element is visited at most twice
     * (once in the first loop to find the duplicate and once in the second loop to restore the numbers)
     * Space Complexity: O(1). All manipulation is done in place, so no additional storage 
     */
}
 