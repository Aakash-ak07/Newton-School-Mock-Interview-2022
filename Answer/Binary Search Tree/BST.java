

public class BST {
    static class Node 
    {
        int data;
        Node left;
        Node right;

        Node(int data) 
        {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    Node root;

    public static Node insertUtil(Node n, int data) 
    {
        if (n == null) {
            n = new Node(data);
            return n;
        }

        if (data < n.data) 
        {                      // if less then put it in left
            n.left = insertUtil(n.left, data);
        } 
        else if (data > n.data) 
        {                       // otherwise right
            n.right = insertUtil(n.right, data);
        }
        return n;
    }

    public static void insert(int data) 
    {
        root = insertUtil(root, data);
    }

    public static void printInorder(Node n) 
    {
        if (n == null)
            return;
        printInorder(n.left);
        System.out.print(n.data + " ");
        printInorder(n.right);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(20);
        bst.insert(50);
        bst.insert(10);
        bst.insert(70);
        bst.insert(30);
        bst.insert(90);

        bst.printInorder(bst.root);
    }
}
