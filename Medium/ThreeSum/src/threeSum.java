import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum{
    public static List<List<Integer>> threesum (int[] nums){
        List<List<Integer>> arrayList = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int left;
        int right = nums.length - 1;
        
        /*
         *[-4, -1, -1, 0, 1, 2] 
         */

         /*[-2 -1 1 2] 
          * left = -2           left = -2    left++ left = -1 
            right = 2   right-- right = 1    right = 1

            i = -1              i = 1        i = 2
         */

         

        for (int i = 0; i < n; i++){
            left = i + 1;
            while (left < right){
                // edge case
                if (nums[i] == 0 && nums[left] == 0 && nums[right] == 0) {
                    arrayList.add(List.of(0,0,0));
                    break;
                }


                // --> left = -1, i = -1, right = 2 --> i = 0, left = -1, right = 2
                if (nums[left] + nums[right] + nums[i] == 0 && left != i && right != i && right != left){
                    arrayList.add(List.of(nums[i], nums[left], nums[right]));
                    break;
                }

                
                if (nums[left] + nums[right] + nums[i] > 0){
                    right--;
                }

                // -4 -1 + 2 = -3 
                if (nums[left] + nums[right] + nums[i]  < 0){
                    left++;
                }
            }

            
        }

        return arrayList;

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