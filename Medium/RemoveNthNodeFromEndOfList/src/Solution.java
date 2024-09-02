public class Solution extends ListNode{

    // Two pass algorithm
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode currentNode = head;
        int length = 0;

        while (currentNode != null){
            length++;
            currentNode = currentNode.next;
        }

        int step = length - n;
        currentNode = dummyNode;
        while (step > 0){
            step--;
            currentNode = currentNode.next;
        }

        currentNode.next = currentNode.next.next;
        return dummyNode.next;
    }

    /*
     * Time Complexity: O(L) where L is the length of the given linked list
     * Space Comlexity: O(1) we just use constant extra space
     */

}