import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {
    public static int lengthOfLongestSubstring(String s) {
        int longest_substring = 0;
        int left = 0;
        int right = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (right < s.length()){
            char c = s.charAt(right);

            if (!map.containsKey(c)){
                map.put(c, 0);
            }else{
                map.put(c, map.get(c) + 1);
            }

            while (map.get(c) > 1){
                char l = s.charAt(left);
                
            }
        }
        return longest_substring;
    }

    public static void main(String[] args) {
        String s = "pwpdved";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
