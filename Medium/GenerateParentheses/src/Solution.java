import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        String str = "((()))()((";
        System.out.println(isValid(str));
        System.out.println(generateParenthesis(3));
    }

    static List<String> generateParenthesis(int n) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(""));
        List<String> answer = new ArrayList<>();

        while (!queue.isEmpty()){
            String curString = queue.poll();

            if (curString.length() == 2 * n){
                if (isValid(curString)) {answer.add(curString);}
                continue; 
            }

            queue.offer(curString + ')');
            queue.offer(curString + '(');
        }
        return answer;
    }

    static boolean isValid(String str){
        int left_count = 0;

        for (char c : str.toCharArray()){
            if (c == '('){
                left_count++;
            }else if (c == ')'){
                left_count--;
            }

            if (left_count < 0) return false;
        }
        return left_count == 0;
    }
}
