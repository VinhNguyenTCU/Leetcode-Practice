public class SecondOptimized {
    static String mergeAlternately(String word1, String word2){
        int left = 0;
        int right = 0;
        StringBuilder builder = new StringBuilder();

        while (left < word1.length() || right < word2.length()){
            if (left < word1.length()){
                builder.append(word1.charAt(left++));
            }
            
            if (right < word2.length()){
                builder.append(word2.charAt(right++));
            }

        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 =  "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}
