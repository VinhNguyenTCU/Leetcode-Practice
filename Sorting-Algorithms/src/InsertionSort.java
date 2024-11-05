public class InsertionSort {



        /*
     *                          |   Comparison    |  |       Swap       |
     *                          Min             Max  Min                Max
     * Insertion Sort           n               n^2  1                  n^2
     *        
     */

    private static void insertionSort(int[] nums){
        for (int i = 1; i < nums.length; i++){
            for (int j = i; j > 0; j--){
                if (nums[j] < nums[j - 1]){
                    swap(nums, j - 1, j);
                }
            }
        }
    }

    private static void swap(int[] nums, int m, int n){
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {29,15,10,3,11};
        System.out.print("Unsorted array: ");
        for (int num : nums){
            System.out.print(" " + num);
        }
        insertionSort(nums);
        System.out.print("\nSorted array used Insertion sort: ");
        for (int num : nums){
            System.out.print(" " + num);
        }
    }
}
