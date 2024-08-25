import java.util.ArrayDeque;
import java.util.Deque;

public class monotonicStack {
    /*
     * Monotonic Stack
     * ------------------------
     * A monotonic stack is a stack whose elements are monotonically increasing or
     * descreasing.
     * Sometimes we store the index of the elements in the stack and make sure the
     * elements corresponding
     * to those indexes in the stack forms a mono-sequence.
     * 
     * Increasing or decreasing?
     * -------------------------
     * If we need to pop smaller elements from the stack before pushing a new
     * element, the stack is decreasing from bottom to top.
     * 
     * Otherwise, it's increasing from bottom to top.
     */

    static int[] monotonicIncreasing(int[] nums){

        // Function to implement monotonic increasing stack

        Deque<Integer> stack = new ArrayDeque<>();

        // Traverse the array
        for (int num : nums){
            // While stack is not empty AND top of stack is more than the current element
            while (!stack.isEmpty() && stack.peekLast() > num){
                // Pop the top element from the stack
                stack.pollLast();
            }

            // Push the current element into the stack
            stack.offerLast(num);
        }
        
        int[] ans = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()){
            ans[index--] = stack.pollLast(); 
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] result = monotonicIncreasing(nums);
        System.out.print("Monotonic increasing stack: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
