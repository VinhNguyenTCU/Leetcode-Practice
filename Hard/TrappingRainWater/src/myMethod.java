public class myMethod {
    public static int trap(int[] height){
        int ans = 0;
        int n = height.length;

        for (int i = 0; i < n; i++){
            int left_max = 0;
            int right_max = 0;

            for (int j = i; j >= 0; j--){
                left_max = Math.max(left_max, height[j]);
            }

            for (int j = i; j < n; j++){
                right_max = Math.max(right_max, height[j]);
            }

            ans += Math.min(left_max, right_max) - height[i];
        }
        
        
        return ans;
    }

    public static void main (String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
        int[] height1 = {4,2,0,3,2,5};
        System.out.println(trap(height1));
    }
}
