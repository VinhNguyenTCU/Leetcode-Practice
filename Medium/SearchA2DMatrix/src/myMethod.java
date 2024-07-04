/**
 * myMethod
 */
public class myMethod {

    public static boolean searchMatrix(int[][] matrix, int target) {

        boolean ans = false;
        for (int i = 0; i < matrix.length; i++){
            if (binarySearch(matrix[i], target)){
                ans = true;
            }
        }

        return ans;

    }

    public static boolean binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;

            if (nums[mid] > target){
                right = mid - 1;
            }

            if (nums[mid] < target){
                left = mid + 1;
            }

            if (nums[mid] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix1 ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        int target1 = 13;

        System.out.println(searchMatrix(matrix, target));
        System.out.println(searchMatrix(matrix1, target1));
    }
}