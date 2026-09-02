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
        // Step 1: Dummy node aur tail pointer create karo
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Step 2: Compare aur link karo jab tak dono non-empty hain
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Step 3: Bachi hui list ko directly link kar do (O(1) operation)
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        // Step 4: Actual head dummy.next par hoga
        return dummy.next;
    }
}