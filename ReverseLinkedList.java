/* 206. Reverse Linked List */

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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode curr = prev.next;
        if (curr == null) {
            return head;
        }
        ListNode next = curr.next;
        prev.next = null;
        curr.next = prev;

        while (next != null) {
            prev = curr;
            curr = next;
            next = curr.next;
            curr.next = prev;
        }

        return curr;
    }
}
