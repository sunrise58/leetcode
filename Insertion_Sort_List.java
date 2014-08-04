/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null) {return null;}
        
        ListNode current = head.next;
        ListNode temp;
        
        while(current != null) {
            temp = head;
            
            while(temp.val <= current.val && temp != current) {
                temp = temp.next;
            }
            
            if(temp.val > current.val) {
                int s,r;
                s = current.val;
                while(temp != current) {
                    r = temp.val;
                    temp.val = s;
                    s = r;
                    temp = temp.next;
                }
                temp.val = s;
            }
            current = current.next;
           
        }
        return head;
    }
}