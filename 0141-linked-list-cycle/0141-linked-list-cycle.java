/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode T = head;
        ListNode R = head;
        
        while (R != null && R.next != null) {
            R = R.next.next;
            T = T.next;
            
            if (T == R) {
                return true; 
            }
        }
        
        return false; 
    }
}
