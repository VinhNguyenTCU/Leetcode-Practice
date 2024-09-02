public class FastAndSlowPointer extends ListNode{
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

        /*
         * Time Complexity: O(N)
         * Space Complexity: O(1)
         */
    }
}
