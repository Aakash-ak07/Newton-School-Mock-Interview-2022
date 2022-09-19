// Print, addNode (insert) and reverse link list.

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
    public static Node insert(Node head, int x)
    {
	Node temp = new Node(x);
    	temp.next = head;
    	head = temp;
	return head;
    }
		
    public static Node reverse(Node node)
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
	
        head = list.insert(head, 10);
        head = list.insert(head, 20);
        head = list.insert(head, 30);
        head = list.insert(head, 40);
//      list.head = new Node(10);
//      list.head.next = new Node(25);
//      list.head.next.next = new Node(45);
//      list.head.next.next.next = new Node(55);
    
        System.out.print("Given Linked list ");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.print("Reversed linked list  ");
        list.printList(head);
    }
}



// Output:
// Given Linked list 10 22 30 40 
// Reversed linked list  40 30 20 10 

