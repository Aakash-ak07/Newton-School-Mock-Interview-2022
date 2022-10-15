// Rempve duplicates in Linked List--- sorted link list and unsorted link list
// using hashmap and normal function


//remove duplicates from sorted list

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
		
    public static Node removeDuplicates(Node head)
    {
	    Node temp = head;
	    while(temp.next != null)
	    {
	        if(temp.data == temp.next.data)   // If Duplicate traverse in the LL
	            temp.next = temp.next.next;
            else                            // If NOT Duplicate then Update the temp 
                temp = temp.next;
	    }
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
	
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
	
        head = list.insert(head, 40);
        head = list.insert(head, 40);
        head = list.insert(head, 30);
        head = list.insert(head, 30);
        head = list.insert(head, 20);
        head = list.insert(head, 10);
        head = list.insert(head, 10);

    
        System.out.print("Given Linked list ");
        list.printList(head);
        head = list.removeDuplicates(head);
        System.out.println("");
        System.out.print("linked list  ");
        list.printList(head);
    }
}

// Input:
// Given Linked list 10 10 20 30 30 40 40 

// Output:
// linked list  10 20 30 40 
--------------------------------
  
//remove duplicated from sorted linked list using Itrative   
  
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
		
    public Node deleteDuplicates(Node head) {
	    Node current = head;
	    Node nxt;
		
	    if(head == null || head.next == null) 
	    	return head;   
	    else
	    {
	        nxt = current.next;       // run till end of next pointer
	        while(nxt != null){
	        if(current.data == nxt.data){   // current and next value same then move next only 
	            nxt = nxt.next;       
	            continue;
	        }                                                // if values are diffent join the link with next  
	        else{                                          // and move current to new current , pnext  to  next
	            current.next =nxt;
	            nxt = nxt.next;
	            current = current.next;
	            }
	        }
	    }
	    if(current != null && nxt == null){  //  condition to  remove last left over Duplicates   
	            current.next = null;
	    }
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
	
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
	
        head = list.insert(head, 40);
        head = list.insert(head, 40);
        head = list.insert(head, 30);
        head = list.insert(head, 30);
        head = list.insert(head, 20);
        head = list.insert(head, 10);
        head = list.insert(head, 10);

    
        System.out.print("Given Linked list ");
        list.printList(head);
        head = list.deleteDuplicates(head);
        System.out.println("");
        System.out.print("linked list  ");
        list.printList(head);
    }
}


// Input:
// Given Linked list 10 10 20 30 30 40 40 

// Output:
// linked list  10 20 30 40 
--------------------------------
  //Remove duplicate from unsorted list  using Hash Map

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
		
    public Node removeDuplicates(Node head) 
    {
         HashSet<Integer> hs = new HashSet<>();
         Node curr = head;
         Node prev = head;
         
         while(curr != null)
         {
             if(hs.contains(curr.data))
             {
                 prev.next = prev.next.next;
             }
            else
            {
                 hs.add(curr.data);
                 prev = curr;
            }
            curr=curr.next;
         }
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
	
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
	
		    head = list.insert(head, 20);
		    head = list.insert(head, 30);
        head = list.insert(head, 40);
        head = list.insert(head, 30);
        head = list.insert(head, 30);
        head = list.insert(head, 20);
        head = list.insert(head, 10);
    	  head = list.insert(head, 20);
    	
        System.out.print("Given Linked list ");
        list.printList(head);
        head = list.removeDuplicates(head);
        System.out.println("");
        System.out.print("linked list  ");
        list.printList(head);
    }
}
------------------------
  
// unsorted linked list using HashMap and scanner class


import java.util.HashSet;
import java.util.Set;
 
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
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
 
    public static Node removeDuplicates(Node head)
    {
        Node previous = null;
        Node current = head;
        // take an empty set to store linked list nodes for future reference
        HashSet<Integer> set = new HashSet<>();
        while (current != null)     // do till the linked list is empty
        {
            if (set.contains(current.data))     // if the current node is seen before, ignore it
            {
                previous.next = current.next;
            }
            else {
                // insert the current node into the set and proceed to the next node
                set.add(current.data);
                previous = current;
            }
            current = previous.next;
        }
 
        return head;
    }
 
    public static void main(String[] args)
    {
        int[] keys = {5, 3, 4, 2, 5, 4, 1, 3};
        // points to the head node of the linked list
        Node head = null;

        for (int i = keys.length - 1; i >= 0; i--) 
        {
            head = new Node(keys[i], head);
        }
        removeDuplicates(head);
        printList(head);
    }
}

// Input:  5 —> 3 —> 4 —> 2 —> 5 —> 4 —> 1 —> 3 —> null
 
// Output: 5 —> 3 —> 4 —> 2 —> 1 —> null 

----------------------



