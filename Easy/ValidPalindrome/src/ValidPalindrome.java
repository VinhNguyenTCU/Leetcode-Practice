public class ValidPalindrome {
    static boolean isPalindrome(String s){
        StringBuilder builder = new StringBuilder();
        String t = s.toLowerCase();
        char[] str = t.toCharArray();
        for (char c : str){
            if (Character.isAlphabetic(c)){
                builder.append(c);
            }
        }

        int left = 0;
        int right = builder.length() - 1;
        while (left < right){
            if (builder.charAt(left) == builder.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
