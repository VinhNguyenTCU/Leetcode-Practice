import java.util.Arrays;

public class optimizedMethod {
    /**
	 * We say that two strings are anagrams if one can be transformed into the
	 * other by permuting the characters (and ignoring case).
	 * 
	 * For example, "Data Structure" and "Saturated Curt" are anagrams,
	 * as are "Elvis" and "Lives".
	 * 
	 * @param s1
	 *            first string
	 * @param s2
	 *            second string
	 * @return true iff s1 is an anagram of s2
	 */

    public static boolean isAnagram(String s1, String s2) {

        // First check the edge case, if the two given strings don't have the same length, then immediately return false
		if (s1.length() != s2.length()) return false; 

        // In case there s1 = a and s2 = A, so I just want to ensure the comparison is case-insensitive.
		s1.toLowerCase();
		s2.toLowerCase();

        // These lines initalize two new arrays with the length 26 --> which is 26 character in alphabet
		char[] str1 = new char[26];
		char[] str2 = new char[26];

        // For each character, it increments the corresponding index in the frequency arrays. 
        // The index is calculated by subtracting the ASCII value of 'a' from the ASCII value of the character, 
        // which gives the position of the character in the alphabet.
        for (int i = 0; i < s1.length(); i++){
            str1[s1.charAt(i) - 'a'] += 1; /* We add 1 to the postion of the character in alphabetical order:
            b = 1 - a = 0  --> the element at index 1 in str1 array will turn from 0 to 1*/
            str2[s2.charAt(i) - 'a'] += 1;
        }

        return Arrays.equals(str1, str2); /*
        --> for (int i = 0; i < 26; i++){
            if (str1[i] != str2[i]) --> return false;
        } 
            
        // If all corresponding elements are equal, the function returns true; otherwise, it returns false. */

        /*
         * Overall time complexity: O(n)
         * 1. Edge case check - O(1)
         * 2. Covert to lowercase - O(n) --> convert each string takes linear time where n is the total length of the given string
         * 3. Populating the frequency arrays takes linear time, as it requires iterating through each character in the strings.
         * 4. Comparing the two fixed-size arrays (each of length 26) is a constant-time operation.
         * 
         * Overall space complexity: O(1)
         * Although we do use extra space, the space complexity is O(1) because the table's size stays constant no matter how large n is.
         */
	}

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        System.out.println(isAnagram(s1, s2));
    }
}
