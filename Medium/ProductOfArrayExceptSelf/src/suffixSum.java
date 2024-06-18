import java.util.ArrayList;
import java.util.List;

public class suffixSum {
    // Suffix Sum is a precomputation technique in which the sum of all the elements of the original array from
    // index i till the end of the array is computed

    // Therefore, this suffix sum array will be created using the relation
    // suffixSum[i] = arr[i] + arr[i+1] + arr[i+2]+...+arr[n-1]

    public static List<Integer> suffixsum(int[] nums){
        List<Integer> arrayList = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++){
            arrayList.add(0);
        }

        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                arrayList.set(i, arrayList.get(i) + nums[j]);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] nums = {15,10,25,5,10,20};
        
        List<Integer> arrayList = suffixsum(nums);
        for (int num : arrayList){
            System.out.print(num + " ");
        }
    }
}
