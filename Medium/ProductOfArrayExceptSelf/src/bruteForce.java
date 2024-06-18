public class bruteForce {
    public static int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int n = nums.length;

        for (int i = 0; i < n; i++){
            product[i] = 1;
        }
        
        for (int i = 0; i < n; i++){
            int total = 1;
            for (int j = 0; j < n; j++){
                if (j == i){
                    continue;
                }
                total *= nums[j];
            }
            product[i] = total;
        }
        return product;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        for (int num : ans){
            System.out.print(num + " ");
        }
    }
}
