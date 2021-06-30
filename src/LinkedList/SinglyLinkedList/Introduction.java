package LinkedList.SinglyLinkedList;

// A simple Java program to introduce a linked list
public class Introduction {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args){
        /* Start with the empty list. */
        Introduction list=new Introduction();

        list.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        /* Three nodes have been allocated dynamically.
          We have references to these three blocks as head, 
          second and third
 
          list.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ */

         list.head.next=second; // Link first node with the second node

         /*  Now next of the first Node refers to the second.  So they
            both are linked.
 
         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */

        second.next=third;
         /*  Now next of the second Node refers to third.  So all three
            nodes are linked.
 
         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */

    }
}
