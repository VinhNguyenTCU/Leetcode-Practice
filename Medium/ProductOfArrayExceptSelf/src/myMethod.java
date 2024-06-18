public class myMethod {
    public static int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int n = nums.length;

        for (int i = 0; i < n; i++){
            product[i] = 1;
        }
        
        for (int i = 0; i < n; i++){
            for (int j = i; j < n - 1; j++){
                product[j] *= nums[j + 1];
                product[i] = product[j];
            }
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
