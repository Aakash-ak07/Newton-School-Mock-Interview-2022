//print link list

import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedList {
	Node head; 

	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			this.data = d;
			next = null;
		} 
	}

	public void printList()
	{
		Node n = head;
		while (n != null) 
    {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args)
	{
		LinkedList lList = new LinkedList();

		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		lList.head.next = second; 
		second.next = third; 
		lList.printList();
	}
}


// Output:
// 1 2 3 
