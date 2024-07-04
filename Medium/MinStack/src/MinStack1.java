import java.util.ArrayList;
import java.util.List;

public class MinStack1 {

    List<int[]> list = new ArrayList<>();

    public MinStack1() {

    }

    public void push(int val) {
        if (list.isEmpty()){
            list.add(new int[] {val, val});
            return;
        }

        int currentMin = list.getLast()[1];
        list.add(new int[] {val, Math.min(val, currentMin)});
    }

    public void pop() {
        list.removeLast();
    }

    public int top() {
        return list.getLast()[0];
    }

    public int getMin() {
        return list.getLast()[1];
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    public static void main(String[] args) {
        MinStack1 minStack1 = new MinStack1();

        minStack1.push(-2);
        minStack1.push(0);
        minStack1.push(-3);
        System.out.println(minStack1.getMin()); // return -3
        minStack1.pop();
        System.out.println(minStack1.top()); // return 0
        System.out.println(minStack1.getMin());// return -2
    }
}
