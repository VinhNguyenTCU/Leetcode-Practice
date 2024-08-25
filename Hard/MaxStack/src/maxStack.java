import java.util.ArrayList;
import java.util.List;

public class maxStack {

    List<int[]> list = new ArrayList<>();
    int currentMax;
    public maxStack() {
    }

    public void push(int x) {
        if (list.isEmpty()) {
            list.add(new int[] { x, x});
            return;
        }
        currentMax = list.getLast()[1];
        list.add(new int[] { x, Math.max(currentMax, x) });
    }

    public int pop() {
        int temp = list.getLast()[0];
        list.remove(list.getLast());
        return temp;
    }

    public int top() {
        return list.getLast()[0];
    }

    public int peekMax() {
        return list.getLast()[1];
    }

    public int popMax() {
        int temp = list.getLast()[1];
        list.add(new int[] {list.getLast()[0], currentMax});
        return temp;
    }

    public static void main(String[] args) {
        maxStack stk = new maxStack();
        stk.push(5); // [5] the top of the stack and the maximum number is 5.
        stk.push(1); // [5, 1] the top of the stack is 1, but the maximum is 5.
        stk.push(5); // [5 - 5, 1 - 5, 5 - 5] the top of the stack is 5, which is also the maximum, because it is
                     // the top most one.
        System.out.println(stk.top()); // return 5, [5, 1, 5] the stack did not change.
        System.out.println(stk.popMax()); // return 5, [5, 1] the stack is changed now, and the top is different from the max
        System.out.println(stk.top()); // return 1, [5, 1] the stack did not change.
        System.out.println(stk.peekMax()); // return 5, [5, 1] the stack did not change.
        System.out.println(stk.pop()); // return 1, [5] the top of the stack and the max element is now 5.
        System.out.println(stk.top()); // return 5, [5] the stack did not change.

        System.out.println("-----------------------------------");

        maxStack stk1 = new maxStack();
        stk1.push(5);
        stk1.push(1);
        System.out.println(stk1.popMax()); // return 5
        System.out.println(stk1.peekMax()); // return 1
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */
