public class Solution extends ListNode {
    public void reorderList(ListNode head) {
        /*
         * Find the middle node of the list by using Fast & Slow pointer
         * 
         * 1 -> 2 -> 3 -> 4
         * The middle node of the linked list is 3
         */

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        /*
         * Reverse the second part of the given LinkedList, in this case, we will reverse
         * 3 -> 4 to 4 -> 3
         * 
         * 1 -> 2
         * 3 -> 4
         */

        ListNode previousNode = null;
        ListNode currentNode = slow; // because the slow pointer is currently pointing the middle Node - which is the beginning of the second List
        ListNode temp = new ListNode();

        while (currentNode != null){
            temp = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = temp;
        }

        /*
         * Merge two Linkedlist
         * 
         * 1 -> 2 \ 
         *         |--> 1 -> 4 -> 2 -> 3
         * 4 -> 3 /
         */

        ListNode first = head; // 1 -> 2 
        ListNode second = previousNode; // 5 -> 4 -> 3

        while (second.next != null){
            temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
    }
    /*
     * Time Complexity: O(N). There are three steps here:
     * - Finding the middle node takes O(N) time
     * - Reversing the second part of the linked list takes O(N / 2) time
     * - Merging two linked list take O(N / 2 time) 
     * 
     * Space complexity: O(1) since we do not allocate any other data structure
     */

}