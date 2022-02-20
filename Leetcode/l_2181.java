/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        if (head == null || head.val != 0)
            return head;
        return help(head);
    }

    static ListNode help(ListNode head) {
        if (head.val == 0) {
            head = head.next;
        }
        ListNode res = head;
        ListNode temp = head;
        int sum = 0;
        while (temp != null) {
            if (temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            } else {
                res.val = sum;
                res.next = temp.next;
                temp = res.next;
                res = res.next;
                sum = 0;
            }
        }
        return head;
    }
}