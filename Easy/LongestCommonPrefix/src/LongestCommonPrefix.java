public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] str){
        if (str.length == 0) return "";
        String prefix = str[0];

        for (int i = 1; i < str.length; i++){ // Looping through other elements except the first one
            // While loop check whether the prefix stands in front of the str[i] element
            while (str[i].indexOf(prefix) != 0){  
                prefix = prefix.substring(0,prefix.length() - 1);
            }
            if (str[i] == null) return "";
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        String[] str1 = {"",""};
        System.out.println(longestCommonPrefix(str));
        System.out.println(longestCommonPrefix(str1));
    }
}
