public class secondMethod {
    public static boolean searchMatrix(int[][] matrix, int target) {

        boolean ans = false;
        int row_length = matrix.length;
        if (row_length == 0) return false;
        int column_length = matrix[0].length;

        int left = 0;
        int right = column_length - 1;
        while (left <= right){
            int middle = (left + right) / 2;

            int middle_number = matrix[middle / column_length][middle % column_length];

            if (middle_number == target) return true;
            else {
                if (target < middle_number) right = middle - 1;
                if (target > middle_number) left = middle + 1;
            }
        }
        return ans;

        /*
         * In this method, we can consider the given input matrix 2D array as a sorted array of length m x n.
         * 
         * To go through all the rows without using for loop, we can alternatively implement: row = middle // n (colum_length)
         * To go through all boxes of each row without using for loop, we can alternatively implement: column = middle % n (column_length) 
         * 
         * Time Complexity: O(log(m * n))
         * Space Complexity: O(1)
         */
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
