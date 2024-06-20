import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class editorialMethod {
    public static List<List<Integer>> threesum (int[] nums){
        List<List<Integer>> arrayList = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n && nums[i] <= 0; i++){
            if ( i == 0 || nums[i - 1] != nums[i]){
                twoSumII(nums, i, arrayList);
            }
        }
        return arrayList;
    }

    static void twoSumII(int[] nums, int i, List<List<Integer>> arrayList){
        int low = i + 1;
        int high = nums.length - 1;
        while (low < high){
            int sum = nums[i] + nums[low] + nums[high];
            if (sum < 0){
                ++low;
            }else if(sum > 0){
                --high;
            }else{
                arrayList.add(Arrays.asList(nums[i], nums[low], nums[high]));
                low++;
                high--;
                while (low < high && nums[low] == nums[low - 1]){
                    ++low;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> arrayList = new ArrayList<>();
        int[] nums = {1,-1,-1,0};

        arrayList = threesum(nums);

        for (List<Integer> list : arrayList){
            for (int val : list){
                System.out.print(val + " ");
            }
        }
        System.out.println();
        List<List<Integer>> arrayList1 = new ArrayList<>();
        int[] nums1 = {0,0,0,0};

        arrayList1 = threesum(nums1);

        for (List<Integer> list : arrayList1){
            for (int val : list){
                System.out.print(val + " ");
            }
        }
    }
}
