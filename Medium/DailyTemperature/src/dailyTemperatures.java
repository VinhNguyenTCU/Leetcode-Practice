import java.util.ArrayDeque;
import java.util.Deque;

public class dailyTemperatures {
    static int[] solution(int[] temperatures){
        /*
         * Decreasing monotonic stack
         * 
         * Monotonic stacks are a good 
         * option when a problem involves comparing the size of numeric elements, with their order being relevant.
         */

        int[] ans = new int[temperatures.length]; // Initialize a result array 
        Deque<Integer> stack = new ArrayDeque<>(); // Initalize a stack to make a monotonic stack in a decreasing order
        
        for (int i = 0; i < temperatures.length; i++){ // Iterate throught the given array
            int currentTemp = temperatures[i]; 
            
            while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemp){ 
                // Iterate through the monotonic stack, if the temperature on the top of the stack
                // is lower than the currentTemp, pop that top number of the stack and take the current subtract that 
                // previous number to find the day gap
                int prev = stack.pop();
                ans[prev] = i - prev;
            }

            stack.push(i);
        }
        return ans;

        /*
         * Time Complexity: O(N)
         * At a first glance, it may look like the time complexity is O(N^2) because there is nested loop inside the 
         * for loop. However, each element can only be added to the stack once, which means the stack is limited to N pops.
         * Every iteration of the while loop uses 1 pop, which means the while loop will not iterate more than N times in total,
         * accross all iterations of the for loop.
         * 
         * Space Complexity: O(N)
         * So the array for the result does not count towards the space complexity.
         * 
         * If the input was decreasing, then no element would ever be popped from the stack, and the stack would grow to a size of N elements at the end.
         */
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ans = solution(temperatures);
        for (int num : ans){
            System.out.print(num + " ");
        }
    }
}
