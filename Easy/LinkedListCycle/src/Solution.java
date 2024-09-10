import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head.next == null) return false;

        Set<ListNode> set = new HashSet<>();

        while (head != null){
            if (set.contains(head)){
                return true;
            }else{
                set.add(head);
                head = head.next;
            }
        }

        return false;
    }

    // Hash Table
    /*Time Complexity: O(N) where N is the length of the given list 
     * adding a new node to a Hash Table costs only O(1) time.
     * 
     * Space Complexity: O(N) where N is the length of the given list.
     * we add every node that the list does not contain. In the worst case, the given linked list
     * is not cycle --> Therefore, we have to add all of the elements.
    */
}
