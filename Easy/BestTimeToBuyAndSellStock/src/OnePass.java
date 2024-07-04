public class OnePass {
    public static int maxProfit(int[] prices){
        int max_profit = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min) min = prices[i];

            if (prices[i] - min > max_profit) max_profit = prices[i] - min;
        }

        return max_profit;

        /*
         * -- Time complexity: The for loop takes O(n) time complexity where n is the total length of the given input array.
         * -- Space complexity: O(1) because we only use constant space to store max_profit and min.
         */
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices1 = {7,6,4,3,1};

        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices1));
    }
}
