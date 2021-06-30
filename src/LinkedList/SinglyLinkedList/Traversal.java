package LinkedList.SinglyLinkedList;

// A simple Java program for traversal of a linked list
public class Traversal {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    /* This function prints contents of linked list starting from head */
    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] args){
        Traversal list=new Traversal();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        list.head.next=second; // Link first node with the second node
        second.next=third; // Link second node with the third node
        list.printList();
    }
    
}
