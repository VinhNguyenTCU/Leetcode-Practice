public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);
        for (int num : nums1){
            System.out.print(num + " ");
        }
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Initialize index to iterature through array nums1 and nums2 and result array
        int left = 0; // left is a pointer for traversing nums1
        int right = 0; // right is a pointer for traversing nums2
        int index = 0; // index is a pointer for traversing result array
        int[] ans = new int[m + n];

        while (left < m && right < n){ // while both pointer still in range
            if (nums1[left] <= nums2[right]){ // if the nums1 pointer value is smaller or equal to the nums2 pointer value
                ans[index] = nums1[left]; // then merge that smaller value to the result array and increase the index of result array
                left++;
                index++;
            }else{
                ans[index] = nums2[right]; // otherwise, merge the smaller value in nums2
                right++;
                index++;
            }
        }

        while (left < m){ // while nums1 still has element and nums2 is finished, merge the rest of nums1 elements to the result array
            ans[index] = nums1[left];
            left++;
            index++;
        }

        while (right < n){ // while nums2 still has element and nums1 is finished, merge the rest of nums2 elements to the result array
            ans[index] = nums2[right];
            right++;
            index++;
        }

        for (int i = 0; i < ans.length; i++){ // Then the merged ans array is copied back to nums1
            nums1[i] = ans[i];
        }

        /*
         * Time Complexity: O(m + n) where m + n is the total elements of nums1 and nums2 array
         * Space Complexity: O(m + n) the length of the result array
         */
    }
}
