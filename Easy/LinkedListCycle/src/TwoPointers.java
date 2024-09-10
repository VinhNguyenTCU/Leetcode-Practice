public class TwoPointers {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }

    /*
     * Floyd's Cycle Finding Algorithm (Two Pointers)
     * 
     * In this method, the space complexity can be reduced to O(1) by considering two pointers at different speed
     * Time Complexity: O(N) traverse through the given Linked List, N is the total number of nodes in the Linked List
     * 
     * 
     * Space Complexity: O(1) create two listnodes costs O(1) space
     */
}
