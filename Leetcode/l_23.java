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
class l_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->{
            return a.val-b.val;
        });
        for(ListNode listnode : lists){
            if(listnode!=null)
                pq.add(listnode);
        }
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(pq.size()>0){
            ListNode node = pq.remove();
            prev.next = node;
            node = node.next;
            prev = prev.next;
            if(node!=null)
                pq.add(node);
        }
        return dummy.next;
    }
}