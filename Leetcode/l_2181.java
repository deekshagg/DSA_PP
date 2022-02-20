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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        if(head == null || head.val!=0) return head;
        // ListNode one = getnode(head);
        // ListNode p = one.next;
        // while(p.val==0 && p!=null){
        //     if(one.next.val == 0){
        //         ListNode two = getnode(p.next);
        //         one.next = two;
        //     }
        //     if(p.next.val == 0 && p.next != null){
        //         p = p.next.next;
        //     }else{
        //         p = p.next;
        //     }
        // }
        return help(head);
    }
    // public ListNode getnode(ListNode head) {
    //     if(head == null || head.val!=0) return head;
    //     ListNode dummy = new ListNode(-1);
    //     dummy.next = head.next;
    //     ListNode p = dummy.next;
    //     int sum = 0;
    //     while(p.val != 0 && p!= null){
    //         sum+=p.val;
    //         p = p.next;
    //     }
    //     if(sum!=0){
    //         ListNode ans = new ListNode(sum);
    //         dummy.next = ans;
    //         ans.next = p;
    //     }
    //     return dummy.next;
    // }
        static ListNode help(ListNode head){    
            if(head.val == 0){
               head = head.next;
            }
            ListNode res = head;
            ListNode temp = head;
            int sum = 0;
            while (temp != null) {
                if (temp.val != 0) {
                    sum += temp.val;
                    temp = temp.next;
                }
                else {
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