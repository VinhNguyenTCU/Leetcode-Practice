import java.util.HashSet;
import java.util.Set;

public class SetSolution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            if (!set.contains(num)) set.add(num);
            return num;
        }

        return -1;
    }
}

/*
 * Time Complexity: O(n) where n is the number of elements in nums array
 * Space Complexity: O(n)
 */
