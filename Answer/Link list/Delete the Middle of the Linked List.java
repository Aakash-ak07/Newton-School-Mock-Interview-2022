//Delete the Middle of the Linked List

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
    
class Main
{
	public static void printList(Node head)
    {
        Node print = head;
        while (print != null)
        {
            System.out.print(print.data + " ");
            print = print.next;
        }
    }
	public static Node deleteMiddleElement(Node head) {
		if(head == null || head.next == null)
	        return null;
	    
	    Node slow, fast, prev;
	    slow = fast = prev = head;

	    while(fast != null && fast.next != null)
	    {
	        prev = slow;
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    prev.next = slow.next;
	    return head;
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
        head = deleteMiddleElement(head);
        printList(head);
    }
}


// Sample Input 1:
// 5
// 1 2 3 4 5

// Sample Output:
// 1 2 4 5
