// You are given a singly-linked list, delete the kth node from the end of the list and then print Linked list after deletion of the kthnode.

// Note: Given k will be always valid.

// Given: 1->2->3->4->5->6
// K=3

// after deletion:
// 1->2->3->5->6

// 4 is the third last node from the end of linked list.

import java.util.*;
import java.io.*;

class LinkedList 
{ 
    Node head; 
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
    void deleteNode(int position) 
    { 
        if (head == null) 
            return;  
        Node temp = head; 
        if (position == 0) 
        { 
            head = temp.next; 
            return; 
        } 
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next;  
        if (temp == null || temp.next == null) 
            return; 
        Node next = temp.next.next; 
        temp.next = next; 
    } 
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0 )
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            LinkedList list = new LinkedList(); 
            int p[]=new int[n];
            for(int i=0;i<n;i++)
            {
                p[i] = sc.nextInt();
            }
            for(int i=n-1;i>=0;i--)
            {
                list.push(p[i]); 
            }
        list.deleteNode(k-1);  
        list.printList(); }
    } 
} 
