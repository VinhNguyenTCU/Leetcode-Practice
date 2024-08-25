public class bruteForce {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ans = dailyTemperatures(temperatures);
        for (int num : ans){
            System.out.print(num + " ");
        }
    }

    static int[] dailyTemperatures(int[] temp){
        int[] ans = new int[temp.length];

        for (int i = 0; i < temp.length; i++){
            int count = 1;
            for (int j = i + 1; j < temp.length; j++){
                if (temp[j] > temp[i]){
                    ans[i] = count;
                    break;
                }
                count++;
            }
        }

        return ans;
    }

    /*
     * Time Complexity: O(N^2)
     * Space Complexity: O(N)
     */
}
