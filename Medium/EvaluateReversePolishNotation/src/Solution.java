import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));

        String[] tokesn2 = {"4","13","5","/","+"};
        System.out.println(evalRPN(tokesn2));
    }

    static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens){
            if (!"+-*/".contains(token)){
                stack.push(Integer.parseInt(token));
                continue;
            }

            int number2 = stack.pop();
            int number1 = stack.pop();

            int result = 0;
            switch (token) {
                case "+":
                    result = number1 + number2;
                    stack.push(result);
                    break;
                case "-":
                    result = number1 - number2;
                    stack.push(result);
                    break;
                case "*":
                    result = number1 * number2;
                    stack.push(result);
                    break;
                case "/":
                    result = number1 / number2;
                    stack.push(result);
                    break;
            }
        }
        return stack.pop();
    }
}
