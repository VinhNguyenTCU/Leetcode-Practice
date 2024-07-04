public class bruteForce {
    public static int maxProfit(int[] prices){
        int max_profit = 0;
        int current_profit = 0;

        for (int i = 0; i < prices.length; i++){
            for (int j = i + 1; j < prices.length; j++){
                if (prices[i] < prices[j]){
                    current_profit = prices[j] - prices[i];
                }
                max_profit = Math.max(current_profit, max_profit);
            }
        }
        return max_profit;
    }

    /*
     * Time Complexity: O(n^2). Loop runs (n(n - 1)) / 2 || area of the triangle where n is the total length of the given input array
     * [7 , 1, 5, 3, 6, 4]
     *      [1, 5, 3, 6, 4]
     *          [5, 3, 6, 4]
     *              [3, 6, 4]
     *                  [6, 4]
     *                      [4]
     * 
     * Space Complexity: O(1)
     */

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices1 = {7,6,4,3,1};

        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices1));
    }
}
