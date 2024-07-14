import java.util.ArrayList;

public class findSubArrayWithGivenSum {
    /*
     * Given a 1-based indexing array arr[] of non-negative integers and an integer
     * sum.
     * You mainly need to return the left and right indexes(1-based indexing) of
     * that subarray.
     * In case of multiple subarrays, return the subarray indexes which come first
     * on moving from left to right.
     * If no such subarray exists return an array consisting of element -1.
     * 
     * Input: arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 }, sum = 23
     * Output: 2 5
     * Explanation: Sum of elements between indices 2 and 5 is 2 + 4 + 8 + 9 = 23
     */

    static ArrayList<Integer> subarraySum(int[] arr, long sum)
    {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = false;
        
        for (int i = 0; i < n; i++){

            int current_sum = arr[i];
            if (current_sum == sum){
                list.add(i + 1); // 1-based indexing
                flag = true;
            }

            for (int j = i + 1; j < n; j++){
                current_sum += arr[j];

                if (current_sum == sum){
                    list.add(i + 1); // 1-based indexing
                    list.add(j + 1); // 1-based indexing
                    flag = true;
                }

            }
        }

        if (flag) return list;
        list.add(-1);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 0, 3, 10, 5};
        long sum = 7;
        ArrayList<Integer> result = subarraySum(arr, sum);
        for (int i : result)
            System.out.print(i + " ");
    }
}