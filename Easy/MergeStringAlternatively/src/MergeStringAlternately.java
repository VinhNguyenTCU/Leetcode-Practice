public class MergeStringAlternately{
    static String mergeAlternately(String word1, String word2){
        StringBuilder builder = new StringBuilder();
        int left = 0;
        int right = 0;
        String s = "";

        while (left < word1.length() && right < word2.length()){
            builder.append(word1.charAt(left)).append(word2.charAt(right));
            left++;
            right++;
        }

        while (left < word1.length()){
            builder.append(word1.charAt(left));
            left++;
        }

        while (right < word2.length()){
            builder.append(word2.charAt(right));
            right++;
        }

        for (int i = 0; i < builder.length(); i++){
            s += builder.charAt(i);
        }
        return s;
        
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 =  "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
    
}