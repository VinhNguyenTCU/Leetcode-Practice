
public class Solution extends ListNode {

    static ListNode reverseList(ListNode head){
        ListNode previousNode = null;
        ListNode currentNode = head;

        while (currentNode != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }

    /*
     * Time Complexity: O(N) because traversing through the whole given LinkedList
     * Space Complexity: O(1)
     */
}
