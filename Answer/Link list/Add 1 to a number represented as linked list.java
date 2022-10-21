// A number (n) is represented in Linked List such that each digit corresponds to a node in linked list. Add 1 to it.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function addOne() that takes head node of the linked list as parameter.

// Constraints:
// 1 <=length of n<= 1000
// Output
// Return the head of the modified linked list.
// Example
// Input 1:
// 456

// Output 1:
// 457

// Input 2:
// 999

// Output 2:
// 1000

    /*
    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    */
    // static Node newNode(int data)
    // {
    //     Node temp = new Node(data);
    //     temp.data = data;
    //     temp.next = null;
    //     return temp;
    // }
    // static Node reverse(Node head){
    //     Node prev = null;
    //     Node current = head;
    //     Node next = null;

    //     while(current != null)
    //     {
    //         next = current.next;
    //         current.next = prev;
    //         prev = current;
    //         current = next;
    //     }
    //     return prev;
    // }
    // static Node addOne(Node head){
    //     head = reverse(head);
    //     head = helper(head);
    //     return reverse(head);
    // }

    // static Node helper(Node head){
    //     Node ans = head;
    //     Node temp = null, prev = null;
    //     int carry = 1, sum;
        
    //     while(head != null)
    //     {
    //         sum = carry + head.data;
    //         carry = (sum >= 10) ? 1 : 0;

    //         sum = sum % 10;
    //         head.data = sum;

    //         temp = head;
    //         head = head.next;
    //     }
    //     if(carry > 0)
    //     {
    //         temp.next = newNode(carry);
    //     }
    //     return ans;
    // }


    // static Node newNode(int data)
    // 	{
    // 		Node temp = new Node(data);
    // 		temp.data = data;
    // 		temp.next = null;
    // 		return temp;
    // 	}

    // 	//for reversing the linked list
    // 	static Node reverseList(Node head)
    // 	{
    // 		Node prev = null;
    // 		Node current = head;
    // 		Node next = null;
    // 		while (current != null) {
    // 			next = current.next;
    // 			current.next = prev;
    // 			prev = current;
    // 			current = next;
    // 		}
    // 		return prev;
    // 	}

    // 	static Node helper(Node head)
    // 	{
    // 		Node result = head;
    // 		Node temp = null, prev = null;

    // 		int carry = 1, sum;

    // 		while (head != null) 
    // 		{
    // 			sum = carry + head.data;

    // 			carry = (sum >= 10) ? 1 : 0; //carry updation

    // 			sum = sum % 10; //if greater than 10

    // 			head.data = sum;

    // 			temp = head;
    // 			head = head.next;
    // 		}

    // 		if (carry > 0)
    // 			temp.next = newNode(carry);

    // 		return result;
    // 	}

    // 	static Node addOne(Node head)
    // 	{
    // 		head = reverseList(head); //for reversing the linked list
    // 		head = helper(head);
    // 		return reverseList(head);
    // 	}


    public static Node addOne(Node head) 
        { 
            head = revNode(head);
            Node temp = head;
            int carry = 1;
            while(temp!=null && carry!=0){
                int num = temp.data + 1;
                temp.data = num%10;
                carry = num/10;
                temp = temp.next;
            }
            if(carry == 1){
                Node new1 = new Node(1);
                temp = head;
                while(temp.next!=null)
                temp = temp.next;
                temp.next = new1;
            }
            head = revNode(head);
            return head;
            
        }
        public static Node revNode(Node head){
            Node temp = head;
            Node fast = head;
            Node slow = null;
            while(temp!=null){
                fast = fast.next;
                temp.next = slow;
                slow = temp;
                temp = fast;
            }
            return slow;
        }
