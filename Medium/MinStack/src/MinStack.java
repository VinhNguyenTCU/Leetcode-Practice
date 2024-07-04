import java.util.Stack;

public class MinStack {

    private Stack<int[]> stack = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        // If the stack is empty, then the min value must be the first number we add
        if (stack.isEmpty()) {
            stack.push(new int[] { val, val });
            return;
        }

        int currentMin = stack.peek()[1];
        stack.push(new int[] { val, Math.min(val, currentMin) });
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        int top_element = stack.peek()[0];
        return top_element;
    }

    public int getMin() {
        int final_min = stack.peek()[1];
        return final_min;
    }

    /*
     * Time Complexity: O(1) for all operations.
     * getMin() is O(1). This operation is O(1) because we already store the minimum value at the top array, instead 
     * had to search for it each time, and the overall time complexity would have been O(n).
     * 
     * Space Complexity: O(n)
     * Worst case is that all the operations are push. In this case, there will be O(2n) = O(n) space used.
     */

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top()); // return 0
        System.out.println(minStack.getMin());// return -2
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}