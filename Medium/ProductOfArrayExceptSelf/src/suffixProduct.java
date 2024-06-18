import java.util.ArrayList;
import java.util.List;

public class suffixProduct {
    // A suffix product array is an array where each element at index i containts
    // the product of all elements to the right of i (including the element at index i)

    public static List<Integer> SuffixProduct(int[] nums){
        List<Integer> arrayList = new ArrayList<Integer>(nums.length);

        for (int i = 0; i < nums.length; i++){
            arrayList.add(1);
        }

        for (int i = nums.length - 2; i >= 0; i--){
            arrayList.set(i, arrayList.get(i + 1) * nums[i + 1]);
        }

        return arrayList;
    }

    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5};

        List<Integer> ans = SuffixProduct(inputArray);
        for (int num : ans){
            System.out.print(num + " ");
        }
    }
}
