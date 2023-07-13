/* 21. Merge Two Sorted Lists */

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode ans = null;
        ListNode p3 = ans;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                ListNode curr = new ListNode(p1.val);
                
                if (ans == null) {
                    ans = curr;
                    p3 = ans;
                } else {
                    p3.next = curr;
                    p3 = p3.next;
                }
                p1 = p1.next;
            }
            else {
                ListNode curr = new ListNode(p2.val);
                if (ans == null) {
                    ans = curr;
                    p3 = ans;
                } else {
                    p3.next = curr;
                    p3 = p3.next;
                }
                p2 = p2.next;
            }
        }

       

        if (p1 != null) {
            if (ans == null) {
                return p1;
            }
            p3.next = p1;
        }

        if (p2 != null) {
            if (ans == null) {
                return p2;
            }
            p3.next = p2;
            
        }

        return ans;
    }
}
