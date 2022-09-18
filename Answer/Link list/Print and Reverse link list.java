// Print and reverse link list

import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedList {
	static Node head; 

    static class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
          this.data = d;
          next = null;
        } 
    }
	
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) 
        {
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
        }
        node = prev;
        return node;
    }
	
    public void printList(Node node)
    {
        while (node != null) 
        {
          System.out.print(node.data + " ");
          node = node.next;
        }
    }
	
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.head = new Node(10);
        list.head.next = new Node(25);
        list.head.next.next = new Node(45);
        list.head.next.next.next = new Node(55);

        System.out.print("Given Linked list ");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.print("Reversed linked list  ");
        list.printList(head);
    }
}



// Output:
// Given Linked list 10 25 45 55 
// Reversed linked list  55 45 25 10 

