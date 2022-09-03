//Reversing the Linked List
// Time Complexity: O(n) 
// Auxiliary Space: O(1)

import java.util.LinkedList;
import java.util.Scanner;
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
public class Main
{
    // Helper function to print a given linked list
    public static void printList(Node head)
    {
        Node print = head;
        while (print != null)
        {
            System.out.print(print.data + " ");
            print = print.next;
        }
    }
    public static Node ReverseLinkedList(Node head)
    {
        if(head == null || head.next == null)
        return head;

        Node result = ReverseLinkedList(head.next);
        head.next.next = head;

        head.next = null;
        return result;
    }
  
    public static void main(String[] args)
    {
    	LinkedList list = new LinkedList();
    	Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int keys[] = new int[size];
        for(int i = 0; i < size; i++)
        {
        	keys[i] = sc.nextInt();
        }
 
        Node head = null;
        for (int i = size - 1; i >= 0; i--) 
        {
            head = new Node(keys[i], head);
        }
        head = ReverseLinkedList(head);
        printList(head);
    }
}


// Input:
// 5
// 1 2 3 4 5
  
// Output:
// 5 4 3 2 1
 
