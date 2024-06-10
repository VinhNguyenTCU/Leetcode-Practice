public class OptimizedValidPalindrome {
    static boolean isPalindrome(String s){
        if (s.isBlank()) return true;
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            char l = toLowerCase(s.charAt(left));
            char r = toLowerCase(s.charAt(right));
            if (!isAlphabeticOrDigit(l)){
                left++;
            }else if (!isAlphabeticOrDigit(r)){
                right--;
            }else if (l != r) {
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }

    static char toLowerCase(char c){
        if (c >= 'A' && c <= 'Z'){
            return (char) (c + 32);
        }
        return c;
    }

    static boolean isAlphabeticOrDigit(char c){
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
