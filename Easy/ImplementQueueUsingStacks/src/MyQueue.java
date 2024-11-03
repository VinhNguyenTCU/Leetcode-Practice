import java.util.Stack;

public class MyQueue {
    
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    private int front = 0;

    public MyQueue(){}

    public void push(int x){
        if (stack1.isEmpty()) front = x;

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        stack2.push(x);

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int pop(){
        int ans = stack1.pop();

        if (!stack1.isEmpty()){
            front = stack1.peek();
        }

        return ans;
    }

    public int peek(){
        return front;
    }

    public boolean empty(){
        return stack1.isEmpty();
    }
}
