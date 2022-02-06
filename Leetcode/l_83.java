/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class l_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentnode = head;
        while(currentnode != null && currentnode.next != null){
            if(currentnode.next.val == currentnode.val)
                currentnode.next = currentnode.next.next;
            else
                currentnode = currentnode.next;
        }
        return head;
    }
}