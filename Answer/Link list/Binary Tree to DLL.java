// Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (leftmost node in BT) must be the head node of the DLL.
// TreeToList
// Example 1:
// Input:
//       1
//     /  \
//    3    2
// Output:
// 3 1 2 
// 2 1 3 
// Explanation: DLL would be 3<=>1<=>2

// Example 2:

// Input:
//        10
//       /   \
//      20   30
//    /   \
//   40   60
// Output:
// 40 20 60 10 30 
// 30 10 60 20 40
// Explanation:  DLL would be 
// 40<=>20<=>60<=>10<=>30.
// ---------------------------------------------
// -----1st full solution----------

import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}
class BT_To_DLL
{
    public static Node buildTree(String str)throws IOException{
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        // Starting from the second element
        int i = 1;
        while(queue.size()>0 && i < ip.length) 
        {    
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
            // Get the current node's value from the string
            String currVal = ip[i];
            // If the left child is not null
            if(!currVal.equals("N")) 
            {    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break; 
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }
    

	public void inorder(Node node)
	{
		if(node==null)
			return ;
		else
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
	}
	public static void printList(Node head) 
  {
      Node prev = head;
          while (head != null) 
          {
              System.out.print(head.data + " ");
        prev = head;
              head = head.right;
          }

      System.out.println();
      while(prev != null)
      {
        System.out.print(prev.data+" ");
        prev = prev.left;
      }
  }
  
	public static void main(String args[])  throws IOException
	{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      while(t > 0)
      {
          String s = br.readLine();
          Node root = buildTree(s);
          Solution g = new Solution();

          Node ans = g.bToDLL(root);
          printList(ans);
          t--;
          System.out.println();
      }
	}
}

class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node tail, head;
    Node bToDLL(Node root)
    {
	    if(root == null)    return null;
	    bToDLL(root.left);
	    if(head == null)    head = tail = root;
	    else
	    {
	        tail.right = root;
	        root.left = tail;
	        tail = root;
	    }
	    bToDLL(root.right);
	    return head;
    }
}

// -------------------2nd solution--------------------

class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
      Node curr = root;
      Stack<Node> st = new Stack<>();
      Node temp = null;
      Node head = null;
      while(curr!=null || !st.isEmpty())
      {
        while(curr!=null)
        {
            st.push(curr);
            curr = curr.left;
        }
        curr = st.pop();
        
        if(temp ==null)
        {
            temp = curr;
            head = curr;
        }
        else
        {
            temp.right = curr;
            temp.right.left = temp;
            temp = temp.right;
        }
        curr = curr.right;
    }
	  return head;
   }
}
