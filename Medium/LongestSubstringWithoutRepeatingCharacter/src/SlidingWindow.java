import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
    public static int lengthOfLongestSubstring(String s) {
        int longest_substring = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()){
            Set<Character> set = new HashSet<>();
            if (!set.contains(s.charAt(right))) set.add(s.charAt(right));
            if (set.contains(s.charAt(right))) {
                while (left < right){
                    char l = s.charAt(left);
                    set.remove(l);
                    left++;
                }
            }
            longest_substring = Math.max(longest_substring, set.size());
            right++;
        }
        return longest_substring;
    }

    public static void main(String[] args) {
        String s = "pwpdved";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
