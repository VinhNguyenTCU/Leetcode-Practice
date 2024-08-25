public class myMethod {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        /*
         * Calculate middle index
         * 
         * if the number at middle index is equal to target, return ans = index of the middle number
         * 4,5,6,7,0,1,2
         * 
         * 5,6,1,2,3
         * int middle = 3 --> nums[middle] = 7
         * target = 0;
         * 
         * if target > first number & target < middle number --> focus on the left side of the middle
         * if target < last number & target > middle number --> focus on the right side of the middle
         * 
         *  3 4 5 6 1 2
         *  2
         */
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) return middle;

            if (nums[middle] > nums[left]){
                left = middle + 1;
            }

            if (nums[middle] < nums[left]){
                right = middle - 1;
            }

            // if (nums[left] > nums[left + 1]) {
            //     pivot_index = left + 1;
            //     break;
            // }

            // if (nums[right -1] < nums[right]){
            //     pivot_index = right - 1;
            //     break;
            // }
        }
        
        // left side
        int ans = binarySearch(nums, target, 0, left - 1);
        if (ans != -1) return ans;

        // right side
        return binarySearch(nums, target, left, n - 1);
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        int left = start;
        int right = end;
        int ans = -1;

        while (left <= right){
            int middle = (left + right) / 2;
            
            if (nums[middle] == target){
                ans = middle;
                break;
            }

            if (target > nums[middle]){
                left = middle + 1;
            }else if (target < nums[middle]){
                right = middle - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        int target = 2;

        System.out.println(search(nums, target));
    }
}
 