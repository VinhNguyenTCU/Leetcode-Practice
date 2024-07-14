import java.util.HashSet;
import java.util.Set;

public class myMethod {
    public static int lengthOfLongestSubstring(String s) {
        int longest_substring = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = i; j < s.length(); j++){
                if (checkRepetition(s, i, j)){
                    longest_substring = Math.max(longest_substring, j - i + 1);
                }
            }
        }
        return longest_substring;
    }

    /*
     * Time Complexity: O(n^3) because in the lengthOfLongestSubstring we used nested for loops,
     * and we also used the checkRepetition method with also iterate through the given String s. Then the time complexity is O(n^3)
     * 
     * Space Complexity: O(n). The function lengthOfLongestSubstring used variable longest_substring to store the result which take O(1) space
     * The function checkRepetition used HashSet to store characters of the substring and in the worst case, set can store up to n characters.
     *
     */

    static boolean checkRepetition(String s, int start, int end){
        Set<Character> set = new HashSet<>();

        for (int i = start; i <= end; i++){
            char c = s.charAt(i);
            if (set.contains(c)) return false;
            set.add(s.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "pwpdved";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
