public class ShortenedSyntax extends ListNode {
    public ListNode middleNode(ListNode head){

        // Put every node into an array A in order. Then the middle node is just A[A.length // 2], since we can retrieve each node by index.
        // We can initialize the array to be of length 100, as we're told in the problem description that the input contains between 1 and 100 nodes.
        ListNode[] A = new ListNode[100];
        int length = 0;

        while (head != null){
            A[length++] = head;
            head = head.next;
        }

        return A[length / 2];

        /*
         * Time Complexity: O(N), where N is the number of nodes given in the list
         * Space Complexity: O(N), the space used by A
         */
    }
}
