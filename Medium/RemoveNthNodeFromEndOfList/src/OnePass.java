public class OnePass extends ListNode {
    /*
     * Instead of using only one pointer, we can optimize the two pass method by using the two pointers method.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * 
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currNode = head;

        for (int i = 0; i < n; i++){
            currNode = currNode.next;
        }

        if (currNode == null) return head.next;

        ListNode nodeBeforeRemovedNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
            nodeBeforeRemovedNode = nodeBeforeRemovedNode.next;
        }
        nodeBeforeRemovedNode.next = nodeBeforeRemovedNode.next.next;
        return head;
    }

}
