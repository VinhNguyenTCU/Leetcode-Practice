public class myMethod {

    /*
     * First, initilize left and right index and use two pointers
     * dif = right - left
     * 
     * compare the right and left, then multiply the smaller with the difference between two indices. 
     */

    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int max = 0;
        int product = 0;

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

        while (left < right){
            int difference = right - left;

            if (height[left] < height[right]){
                product = height[left] * difference;
                left++;
            }else if (height[left] >= height[right]){
                product = height[right] * difference;
                right--;
            }

            if (product > max){
                max = product;
            }
           

        }
        return max;
    }

    public static void main(String[] args) {
        // int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height1 = {2,3,4,5,18,17,6};
        // System.out.println(maxArea(height));
        System.out.println(maxArea(height1));
    }
}
