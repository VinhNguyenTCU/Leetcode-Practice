class Solution extends ListNode{
    public ListNode middleNode(ListNode head) {

        // My solution
        ListNode currentNode = head;
        int length = 0;

        while (currentNode != null){
            length++;
            currentNode = currentNode.next;
        }

        int IndexOfNode = length / 2;

        currentNode = head;
        for (int i = 0; i < IndexOfNode; i++){
            currentNode = currentNode.next;
        }
        return currentNode;

        /*
         * Time Complexity: O(N). The overall time complexity of this code is O(N) because the dominant term is the traversal 
         * of the linked list, which is performed twice (once to find the length and once to reach the middle node) 
         * Space Complexity: O(1)
         */
    }
}