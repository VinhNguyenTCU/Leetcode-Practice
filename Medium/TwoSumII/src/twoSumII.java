public class twoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int left = 0;
        int right = length - 1;

        while (left < right){
            if (numbers[left] + numbers[right] > target){
                right--;
            }
            
            if (numbers[left] + numbers[right] < target){
                left++;
            }

            if (numbers[left] + numbers[right] == target){
                return new int[] {left + 1, right + 1};
            }
        }
        return null;
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
