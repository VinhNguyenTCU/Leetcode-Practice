import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {
    public static int lengthOfLongestSubstring(String s) {
        int longest_substring = 0;
        int left = 0;
        int right = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (right < s.length()){
            if (!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), 0);
            }else{
                map.put(s.charAt(right), map.get(s.charAt(right)) + 1);
            }

            while (map.get(s.charAt(right)) > 1){
                
            }
        }
        return longest_substring;
    }

    public static void main(String[] args) {
        String s = "pwpdved";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
