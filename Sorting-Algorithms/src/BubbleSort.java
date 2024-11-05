public class BubbleSort {

    /*
     * How it works:
     * 1. Go through the array, one value at a time
     * 2. For each value, compare the value with next value
     * 3. If the value is higher than the next one, swap the values so that the highest value comes last
     * 4. Go through the array as many times as there are values in the array
     */

    /*
     *                          |   Comparison    |  |       Swap       |
     *                          Min             Max  Min                Max
     * Bubble Sort              n^2             n^2  1                  n^2
     * Bubble Sort - Optimized  n               n^2  1                  n^2
     *        
     */
    public static void bubblesort(int[] nums){
        int n = nums.length;
        int temp;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++){
                if (nums[i] > nums[i + 1]){
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] nums = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
        System.out.print("Unsorted array: ");
        for (int num : nums){
            System.out.print(" " + num);
        }
        bubblesort(nums);
        System.out.print("\nSorted array used Bubble sort: ");
        for (int num : nums){
            System.out.print(" " + num);
        }
    }
}
