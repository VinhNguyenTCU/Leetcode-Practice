import java.util.Arrays;

public class Solution {
    public int findDuplicate(int[] nums) {
        int current = 0;
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            current = nums[i];

            if (current == nums[i - 1]) return current;
        }

        return -1;
    }

    /*
     * Approach 1: Sort
     * In an unsorted array, duplicate elements may be scattered across the array. 
     * However, in a sorted array, duplicate numbers will be next to each other.
     * 
     * Time Complexity: O(nlogn) --> Sorting the array takes O(nlogn) time. This 
     * is followed by a linear scan, resulting in a total of O(nlogn) + O(n) = O(nlogn) time.
     * 
     * Space Complexity: O(logn) or O(n)
     * 
     * The space complexity of the sorting algorithm depends on the implementation of each programming language:
     *      - In Java, Arrays.sort() for primitives is implemented using a variant of the Quick Sort Algorithm, which has 
     *        a space complexity of O(logn).
     *      - In C++, the sort() function provided by STL uses a hybrid of Quick Sort, Heap Sort and Insertion Sort, with a worst
     *        case space complexity of O(logn).
     *      - In Python, the sort() function is implemented using the Timsort algorithm, which has a worst-case space complexity of O(n)
     */
}
