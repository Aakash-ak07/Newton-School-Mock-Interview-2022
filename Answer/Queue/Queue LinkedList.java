// Queue Implementation using LinkedList
// Insert- Delete- Display- Count

public class Queue_LinkedList {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    Node front = null;
    Node rear = null;

    public static void insert(int data)
    {
        Node n = new Node(data);
        n.next = null;
        if (front == null) {
            front = rear = n;
            System.out.println(n.data+" is Inserted ");
        }
        else
        {
            rear.next = n;
            rear = n;
            System.out.println(n.data+" is Inserted ");
        }
    }
    public static void delete()
    {
        if (front == null){
            System.out.println("Underflow");
        }
        else
        {
            System.out.println(front.data+" is deleted form Queue");
            front = front.next;
        }
    }
    public static void display()
    {
        Node n = front;
        if(n == null)
        {
            System.out.println("Queue is empty");
            return;
        }
        while(n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
    public static int count()
    {
        Node n = front;
        int p =0;

        while(n!=null)
        {
            p++;
            n = n.next;
        }
        return p;
    }
    public static void main(String[] args) 
    {
        Queue_LinkedList q = new Queue_LinkedList();
        q.insert(1);
        q.insert(11);
        q.insert(12);
        q.insert(123);
        q.insert(1234);
        q.delete();
        q.display();
        System.out.println("total number of nodes : "+q.count());
    }
}
