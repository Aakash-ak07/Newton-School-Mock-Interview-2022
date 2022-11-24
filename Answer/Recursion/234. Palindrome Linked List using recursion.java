// Given the head of a singly linked list, return true if it is a palindromeor false otherwise.

// Example 1:
// Input: head = [1,2,2,1]
// Output: true
  
// Example 2:
// Input: head = [1,2]
// Output: false


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
    ListNode temp = null;
    public boolean isPalindrome(ListNode head) {
        if(head == null)    return true;
        if(temp == null)    temp = head;

        if(!isPalindrome(head.next) ||temp.val != head.val)
            return false;
        
        temp = temp.next;
        return true;
    }
}
