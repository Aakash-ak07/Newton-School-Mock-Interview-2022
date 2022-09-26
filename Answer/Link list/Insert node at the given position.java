// Given a linked list consisting of N nodes and two integers M and K. Your task is to add element K at the Mth position from the start of the linked list

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
		
    public void printList(Node node)
    {
        while (node != null) 
        {
          System.out.print(node.data + " ");
          node = node.next;
        }
    }
	
	  public static Node addElement(Node head, int k ,int pos ) {
        pos = pos - 1;
        Node temp = head;

        Node insert = new Node(k);
        if(pos == 0)
        {
            insert.next = head;
            return insert;
        }
        int currentPos = 0;
        while(currentPos < pos -1 && head.next != null)
        {
            head = head.next;
            currentPos++;
        }
        Node temp2 = head.next;
        head.next = insert;
        head = head.next;
        head.next = temp2;

        return temp;
	}
	
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
	
        head = list.insert(head, 1);
        head = list.insert(head, 3);
        head = list.insert(head, 2);
        head = list.insert(head, 4);
        head = list.insert(head, 5);
        System.out.print("Given Linked list :");
        list.printList(head);
        
		    head = list.addElement(head, 3, 2);
		
        System.out.println("");
        System.out.print("insert new element:");
        
        list.printList(head);
    }
}



// Sample Input:-
// 5 3 2
// 1 3 2 4 5

// Sample Output:-
// 1 3 2 2 4 5

// Explanation:-
// here M is 3 and K is 2
// so we insert 2 at the 3rd position, resulting list will be 1 3 2 2 4 5
