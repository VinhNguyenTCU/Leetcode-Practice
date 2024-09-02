
public class Solution extends ListNode{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode();
        ListNode currentNode = dummyNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            int x; 
            if (l1 != null){
                x = l1.val;
            }else{
                x = 0;
            }
            int y;
            if (l2 != null){
                y = l2.val;
            }else{
                y = 0;
            }

            int sum = x + y + carry;

            carry = sum / 10;

            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyNode.next;
    }
}