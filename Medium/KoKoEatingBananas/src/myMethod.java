public class myMethod {
    /* 3 6 7 11 --> h = 8 
     * 1 hour - 4
     * 2 hour - 4 so the second pile will remain 2 bananas
     * 3 hour - 2 done the second pile
     * 4 hour - 4 so the third pile will remain 3 bananas
     * 5 hour - 3 done the third pile
     * 6 hour - 4 so the last pile will remain 7 bananas
     * 7 hour - 4 so the last pile will remain 3 bananas
     * 8 hour - eat the last 3 bananas
    */

    public static int minEatingSpeed(int[] piles, int h) {
        int speed = 1;

        while(true){
            int hour_needed = 0;
            for (int pile : piles){
                hour_needed += Math.ceil((double) pile / speed);
                if (hour_needed > h) break;
            }
            if (hour_needed <= h) return speed;
            speed += 1;
        }
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
}
