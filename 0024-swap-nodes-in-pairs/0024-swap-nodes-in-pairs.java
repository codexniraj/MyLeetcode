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
    public ListNode swapPairs(ListNode head) {
    ListNode l=new ListNode(0);
       l.next=head;
       ListNode f=l;
       ListNode s=null;
       ListNode t=null;
       while(f.next!=null&&f.next.next!=null){
           s=f.next;
           t=f.next.next;
           s.next=t.next;
           t.next=s;
           f.next=t;
           f=s;
       } 
     return  l.next;    
    }
}