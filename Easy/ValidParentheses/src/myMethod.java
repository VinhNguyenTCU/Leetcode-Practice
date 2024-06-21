import java.util.Stack;

public class myMethod {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        char[] str = new char[s.length()];

        for (int i = 0; i < s.length(); i++){
            str[i] = s.charAt(i);
        }

        for (int i = 0; i < s.length(); i++){
            if (str[i] == '(' || str[i] == '{' || str[i] == '['){
                stack.push(str[i]);
            }else{
                if (stack.isEmpty()) return false;
                if (str[i] == ')' && stack.peek() == '('){
                    stack.pop();
                }else if (str[i] == '}' && stack.peek() == '{'){
                    stack.pop();
                }else if (str[i] == ']' && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
        
    }


}
