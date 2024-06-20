public class optimizedMethod {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = {-1, -1};
        int length = numbers.length;
        int left = 0;
        int right = length - 1;
        int middle, sum;
        
        while (left < right){
            middle = (left + right) / 2;
            sum = numbers[left] + numbers[right];

            if (sum == target){
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            }

            if (sum < target){
                if (numbers[middle] + numbers[right] < target){
                    left = middle + 1;
                }else{
                    left++;
                }
            }

            if (sum > target){
                if (numbers[left] + numbers[middle] > target){
                    right = middle - 1;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(numbers, target);
        for (int value : ans){
            System.out.print(value + " ");
        }
    }
}
