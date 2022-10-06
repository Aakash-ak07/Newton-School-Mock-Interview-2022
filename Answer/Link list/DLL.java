//DLL in Print, Delete And Insert at pos

class NodeDLL{
    int value;
    NodeDLL next;
    NodeDLL prev;
    NodeDLL(int nodeValue){
        value=nodeValue;
    }
}
public class DoubleLinkedList {
    static NodeDLL head=null;
   public static void insertAtEnd(int number){
        NodeDLL temp=new NodeDLL(number);
        if(head==null){
            head=temp;
        }else{
            NodeDLL run=head;
            while(run.next!=null){
                run=run.next;
            }
            run.next=temp;
            temp.prev=run;
        }

    }
  public static void printLL(){
    NodeDLL run=head;
    while(run!=null){
        System.out.println(run.value+" ");
        run=run.next;

   }
    System.out.println();

    
   }
   static void insertAtPos(int pos,int val){
    NodeDLL temp=new NodeDLL(val);
    if(pos==1){
        temp.next=head;
        head=temp;
    }else{
        NodeDLL run=head;
        for(int i=2;i<=pos-1;i++){
            run=run.next;
        }
        temp.next=run.next;
        run.next=temp;
        temp.prev=run;
        if(temp.next!=null){
            temp.next.prev=temp;
        }
    }
   }
    public static void main(String[] args) {
        // insertAtEnd(2);
        // insertAtEnd(3);
        // insertAtEnd(4);
        // printLL();
        insertAtPos(1,10);
        insertAtPos(2,20);
        insertAtPos(3,30);
        printLL();
        insertAtPos(2,30);
        printLL();
    }
}
