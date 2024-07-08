public class binarySearch {
    public static int minEatingSpeed(int[] piles, int h) {
        /*
         * 3 6 7 11 --> h = 8
         * 1 hour - 4
         * 2 hour - 4 so the second pile will remain 2 bananas
         * 3 hour - 2 done the second pile
         * 4 hour - 4 so the third pile will remain 3 bananas
         * 5 hour - 3 done the third pile
         * 6 hour - 4 so the last pile will remain 7 bananas
         * 7 hour - 4 so the last pile will remain 3 bananas
         * 8 hour - eat the last 3 bananas
         */
        int left = 1, right = 1; // The only possible initial speed is 1
 
        for (int pile : piles) {
            right = Math.max(pile, right); // Iterate through the piles to pick out the maximum value that can be the upperbound
        }

        while (left < right) { // 1 vs 11 --> middle = 6;
            int middle = (left + right) / 2; // Get the middle index between left and right boundaries index
            int hour_needed = 0; // set hour_needed = 0 after every iteration, if you put hour_needed outside the while loop, it will keep add up without reseting
            for (int pile : piles){ // Iterate over the piles and calculate the amount of hour for Koko finishes eating all the bananas
                hour_needed += Math.ceil((double) pile / middle); // 6 hours < 8 hours
            }
            if (hour_needed <= h){ /*
                If the hour_needed is less than the amount of given hour, then we can lower the upperbound index to middle, because if 
                when Koko can finish with the speed of N, then it will always finish with N + 1 */
                right = middle;
            }else{
                left = middle + 1;
            }
        }
        return right;

        /*
         * Space Complexity: O(1) -> For each eating speed middle, we iterate over the array and calculate the total hours Koko spends, which costs constant space.
         * Time Complexity: O(nlogm) 
         */
    }

    public static void main(String[] args) {
        int[] piles = { 30,11,23,4,20 };
        int h = 6;
        System.out.println(minEatingSpeed(piles, h));
    }
}
