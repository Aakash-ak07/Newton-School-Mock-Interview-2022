// Queue :-- isFull, isEmpty, insert, delete and display

import java.util.Scanner;

public class Queue_array {
    Scanner s = new Scanner(System.in);
    static final int max = 5;               //FIRST IN FIRST OUT FIFO
    int rear = -1;
    int front  = -1;
    int[] Queue = new int[max];


    public static boolean isFull(){
        if(rear == max-1){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isEmpty()
    {
        if(rear == -1 || front ==-1)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }


    public static void insert()
    {
        if(isFull())
        {
            System.out.println("Queue is Full..!!");
            return;
        }
        else
        {
            System.out.println("Enter element");
            int e = s.nextInt();
            rear++;
            Queue[rear] = e;
            if(rear == 0){
                front = 0;
            }
        }
    }

    public static void Delete()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else if(front == rear )
        {
            front = rear = -1;
        }
        else
        {
            int element = Queue[front];
            front++;
            System.out.println(element+" Deleted from queue");
        }
    }

    public static void display()
    {
        for (int i = front; i <= rear ; i++) 
        {
            System.out.print(Queue[i]+" ");
        }
    }

    public static void main(String[] args) {
        Queue_array q = new Queue_array();
        q.insert();
        q.insert();
        q.insert();
        q.insert();
        q.insert();
        q.Delete();
        q.Delete();

        System.out.println("\n\n");
        System.out.print("Front --> ");
        q.display();
        System.out.print(" <--Rear");
    }
}
