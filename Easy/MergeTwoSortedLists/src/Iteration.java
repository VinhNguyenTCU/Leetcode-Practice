public class Iteration {
    public static void main(String[] args) {
        
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummyNode = new ListNode(); // We set up a dummyNode that allows us to easily return the head of the merge list later.
        ListNode headNode = dummyNode;  // We also maintain a headNode pointer, which will points to the current node

        while (list1 != null && list2 != null){ // while both the lists still have nodes, we will compare the value of node on each list
            if (list1.val < list2.val){
                headNode.next = list1; // Because list1.val is smaller than list2.val, then the currentNode will point to the list1, and we update the node of the list1 by one
                list1 = list1.next;
            }else{
                headNode.next = list2; // Because list2.val is equal or smaller than list1.val, then the currentNode will point to the list2, and we update the node of the list2 by one
                list2 = list2.next;
            }

            headNode = headNode.next; // Then we update the currentNode by one
        }

        if (list1 != null){ // If the list1 still have nodes, we move all the list1 to the result list
            headNode.next = list1;
            list1 = list1.next;
        }

        if (list2 != null){ // If the list2 still have nodes, we move all the list1 to the result list
            headNode.next = list2;
            list2 = list2.next;
        }

        return dummyNode.next; // Finally, the function returns the merged list starting from dummyNode.next since headNode is just a placeholder
    }

    /*
     * Time Complexity: O(m + n)
     * Space Complexity: O(m + n)
     */
}
