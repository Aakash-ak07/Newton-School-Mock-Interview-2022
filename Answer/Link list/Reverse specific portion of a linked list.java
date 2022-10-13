

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
 
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
 
class Main
{
    // Utility function to print a linked list
    public static void printList(String msg, Node head)
    {
        System.out.print(msg);
 
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
 
        System.out.println("null");
    }
 
    // Iteratively reverse a linked list from position `m` to `n`
    public static Node reverse(Node head, int m, int n)
    {
        // base case
        if (m > n) {
            return head;
        }
 
        Node prev = null;
        Node curr = head;
 
        // 1. Skip the first `m` nodes
        for (int i = 1; curr != null && i < m; i++)
        {
            prev = curr;
            curr = curr.next;
        }
 
        // `prev` now points to (m-1)'th node
        // `curr` now points to m'th node
 
        Node start = curr;
        Node end = null;
 
        // 2. Traverse and reverse the sublist from position `m` to `n`
        for (int i = 1; curr != null && i <= n - m + 1; i++)
        {
            // Take note of the next node
            Node next = curr.next;
 
            // move the current node onto the `end`
            curr.next = end;
            end = curr;
 
            // move to the next node
            curr = next;
        }
 
        /*
            `start` points to the m'th node
            `end` now points to the n'th node
            `curr` now points to the (n+1)'th node
        */
 
        // 3. Fix the pointers and return the head node
        if (start != null)
        {
            start.next = curr;
            if (prev != null) {
                prev.next = end;
            }
            else {
                head = end;     // when m = 1, `prev` is null
            }
        }
 
        return head;
    }
 
    public static void main(String[] args)
    {
        int m = 2, n = 5;
 
        Node head = null;
        for (int i = 7; i >= 1; i--) {
            head = new Node(i, head);
        }
 
        printList("Original linked list: ", head);
        head = reverse(head, m, n);
        printList("Reversed linked list: ", head);
    }
}


// Input:
 
// Linked List: 1 —> 2 —> 3 —> 4 —> 5 —> 6 —> 7 —> None
 
// start position = 2
// end position = 5
 
// Output: 1 —> 5 —> 4 —> 3 —> 2 —> 6 —> 7 —> None 
