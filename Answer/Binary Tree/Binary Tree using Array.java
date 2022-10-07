
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayToBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    Node root;

   public static void printInorder(Node n) {
        if (n == null)
            return;
        printInorder(n.left);
        System.out.print(n.data + " ");
        printInorder(n.right);
    }

    public static void printPreOrder(Node n) 
    {
        if (n == null)
            return;
        System.out.print(n.data + " ");
        printPreOrder(n.left);
        printPreOrder(n.right);
    }

    public static void printPostOrder(Node n) 
    {
        if (n == null)
            return;
        printPostOrder(n.left);
        printPostOrder(n.right);
        System.out.print(n.data + " ");
    }

    public static void printLevelOrder(Node n) 
    {
        Queue<Node> q = new LinkedList<Node>();
        if (n == null)
            return;
        q.add(n);
        while (!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                node temp = q.remove();
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
    }

    public node levelOrderInsertion(int[] arr, int i) {
        Node n = null;
        if (i < arr.length) {
            // root node i-1/2
            n = new node(arr[i]);

            // left node 2*1+1
            n.left = levelOrderInsertion(arr, 2 * i + 1);

            // right node 2*i+2
            n.right = levelOrderInsertion(arr, 2 * i + 2);

        }
        return n;
    }

    // Tree
    // 10
    // / \
    // 20 30
    // / \ / \
    // 40 50 60 70
    public static void main(String[] args) {
        ArrayToBinaryTree tobt = new ArrayToBinaryTree();
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        tobt.root = tobt.levelOrderInsertion(arr, 0);
        tobt.printInorder(tobt.root);
        System.out.println();
        tobt.printPreOrder(tobt.root);
        System.out.println();
        tobt.printPostOrder(tobt.root);
        System.out.println();
        tobt.printLevelOrder(tobt.root);
    }
}
