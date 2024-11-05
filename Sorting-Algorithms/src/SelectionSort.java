public class SelectionSort {

    /*Selection sort is a simple and efficient soring algorithm that works by repeatedly 
     * selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list.
    */

    /*
     * How it works:
     * 1. Go through the array to find the lowest value
     * 2. Move the lowest value to the front of the unsorted part of the array
     * 3. Go through the array again as many times as there are values in the array
     */

    // [64, 25, 12, 22, 11] --> [11, 12, 22, 25,64]

        /*
     *                          |   Comparison    |  |       Swap       |
     *                          Min             Max  Min                Max
     * Selection Sort           n^2             n^2  1                  n
     *        
     */
    public static void selectionsort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++){
            int min_index = i;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] < nums[min_index]){
                    min_index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min_index];
            nums[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
        System.out.print("Unsorted array: ");
        for (int num : nums){
            System.out.print(" " + num);
        }
        selectionsort(nums);
        System.out.print("\nSorted array used Selection sort: ");
        for (int num : nums){
            System.out.print(" " + num);
        }
    }
}
