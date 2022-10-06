//Single Link List - Insert Node

class Node{
    int value;
    Node next;
    Node(int nodeValue){
        value=nodeValue;
    }
}
public class SingleLinkedList {
    static Node head=null;
    public static void printLL(){
        Node run=head;
        while(run!=null){
            System.out.println(run.value+" ");
            run=run.next;
        }
        System.out.println();
    }
    public static void insertAtEnd(int number){
        //insert no. at the end
        //cerate a node for number
       Node temp =new Node(number);
       if(head==null)
       {
        head=temp;
       }
      else
      {
        Node run = head;
        run.next = temp;
        //do i have any neighbour
        //if no neighbours, i m the last
        while(run.next!=null)
        {
            run=run.next;
        }
        run.next=temp;
      }
    }
    
   public static void main(String[] args) {
      head=new Node(10);
      Node s1=new Node(12);
      Node s2=new Node(15);
      head.next=s1;
      s1.next=s2;
      printLL();
      insertAtEnd(50);
      printLL();
    }
}
