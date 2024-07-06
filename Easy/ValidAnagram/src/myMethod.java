import java.util.Arrays;

public class myMethod {

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
		String s1lower = s1.toLowerCase();
		String s2lower = s2.toLowerCase();

        // These lines convert the lowercase strings to arrays
		char[] str1 = s1lower.toCharArray();
		char[] str2 = s2lower.toCharArray();

        // Sort the character arrays, in alphabetical order --> so "anagram" will become "aaagmnr"
		Arrays.sort(str1); // Time complexity of these sorting methods are O(nlogn)
		Arrays.sort(str2);
		
		int i = 0; // Initalize an index, iterate through both arrays to compare each element of first and second arrays.
        
        // If all corresponding elements are equal, the function returns true; otherwise, it returns false.
		while (i < s1.length()){ 
			if (str1[i] == str2[i]) {
				i++;
				continue;
			}
			else return false;
		}
		return true;

        /*
         * Overall time complexity: O(nlogn)
         * 1. Edge case check - O(1)
         * 2. Covert to lowercase - O(n) --> convert each string takes linear time where n is the total length of the given string
         * 3. Convert character to arrays - O(n) 
         * 4. Sort the character arrays - O(nlogn)
         * 5. While loop - O(n)
         * 
         * Overall space complexity: O(n)
         * 1. Case conversion - O(1)
         * 2. Char arrays conversion - O(n)
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
