// Reverse the linked list by taking user input


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
 
public class Main
{
    static Node head;   
    public static void printList(Node head)
    {
        while (head != null) 
        {
          System.out.print(head.data + " ");
          head = head.next;
        }
    }
  
    public static Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) 
        {
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
        }
        head = prev;
        return head;
    }
 
    public static void main(String[] args)
    {
    	LinkedList list = new LinkedList();
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int keys[] = new int[n];
        for(int i = 0; i < n; i++)
        {
        	keys[i] = sc.nextInt();
        }
        head = null;
        for (int i = n - 1; i >= 0; i--) 
        {
            head = new Node(keys[i], head);
        }
        
        System.out.println("Reverse Linked List: ");
        head = reverse(head);
        printList(head);
    }
}

// Input:
// 7
// 12 17 199 15 20 22 28
  
// Reverse LinkedList : 
// 28 22 20 15 199 17 12 
