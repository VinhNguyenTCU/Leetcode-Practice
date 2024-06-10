public class FirstOptimized {
    static String mergeAlternately(String word1, String word2){
        StringBuilder builder = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        for (int i = 0; i < min; i++){
            builder.append(word1.charAt(i));
            builder.append(word2.charAt(i));
        }

        builder.append(word1.substring(min, word1.length()));
        builder.append(word2.substring(min, word2.length()));

        return builder.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 =  "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}
