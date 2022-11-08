// Given the head of a linked list, rotate the list to the right by k places.
// Example 1:
// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]

// Example 2:
// Input: head = [0,1,2], k = 4
// Output: [2,0,1]



class Solution {
    public ListNode rotateRight(ListNode head, int k) {
     if (k<=0 || head==null|| head.next==null){
            return head;
        }

        int length = 1;
        ListNode last = head;
		
		      // For reaching to last Node and getting lenght
        while (last.next!=null){
            last = last.next;
            length++;
        }
		     // Now point last node to current head
        last.next=head;
		    // if k<6
        int roatations = k % length;
      
		    // no of skip need to made get desired new last node 
        int skip = length - roatations;
        ListNode newLas t= head;
		
		    // Traversing till new last
        for (int i = 0; i < skip-1; i++) 
        {
            newLast=newLast.next;
        }
      
		    // Now Pointing , new Last to new head;
        head=newLast.next;
		    // At last put new last point to null
      
        newLast.next=null;
        return head;
    }
}
