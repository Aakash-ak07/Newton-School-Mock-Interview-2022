//Array to Binary Search Tree

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) 
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class ArrayToBST {
  public static void preorder(Node root) {
        if(root == null) 
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node convertToBST(int arr[], int start, int end) {
        if(start > end) 
            return null;

        int mid = (start + end) / 2;
        Node current = new Node(arr[mid]);
        current.left = convertToBST(arr, start, mid - 1);
        current.right = convertToBST(arr, mid + 1, end);
        return current;
    }
  
    public static void main(String args[]) {
        int arr[] = {3, 5, 6, 9, 12, 13, 14};
        Node root = convertToBST(arr, 0, arr.length-1);
        preorder(root);
    }
}



          /*
                     9
                   /   \
                  5     13
                 / \    / \
                3   6  12 14  
             BST
         */
