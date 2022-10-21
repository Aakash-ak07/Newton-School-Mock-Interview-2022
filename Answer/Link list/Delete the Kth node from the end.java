// Given a linked list consisting of N nodes and an integer K, your task is to delete the Kth node from the end of the linked list
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteElement() that takes head node and K as parameter.

// Constraints:
// 1 <=K<=N<= 1000
// 1 <=Node.data<= 1000
// Output
// Return the head of the modified linked list
// Example
// Input 1:
// 5 3
// 1 2 3 4 5

// Output 1:
// 1 2 4 5

// Explanation:
// After deleting 3rd node from the end of the linked list, 3 will be deleted and the list will be as 1, 2, 4, 5.

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
public static Node deleteElement(Node head,int k) {
    if(head == null) return null;
    int count = 0;
    Node temp = head;
    while(temp != null)
    {
        temp = temp.next;
        count++;
    }
    int target = count - k;
    if(target == 0)
    {
        return head.next;
    }
    temp = head;
    for(int i = 0; i < target-1; i++)
        temp = temp.next;
    
    temp.next = temp.next.next;

    return head;
}
