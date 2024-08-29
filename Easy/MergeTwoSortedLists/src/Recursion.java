public class Recursion {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }else if(list2 == null){
            return list1;
        }else if (list1.val < list2.val){ // Each recursive call process exactly one node from either list1 or list2
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else if (list1.val >= list2.val){
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
        return null;
    }

    /*
     * Time Complexity: O(m + n) because each recursive call increments the pointer to l1 or l2 by one (
     * approaching the dangling null at the end of each list), there will be exactly one call to mergeTwoLists per element in each list.
     * Therefore, the time complexity is linear in the combined size of the lists.
     * Space Complexity: O(m + n)
     * 
     * The first call to mergeTwoLists does not return until the ends of both l1 and l2
     * have been reached, so n + m stack frames consume O(n + m ) space
     */
}
