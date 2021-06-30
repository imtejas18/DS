package LinkedList.SinglyLinkedList;

// A complete working Java program to demonstrate deletion in singly linked list

public class Deletion {
    
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    /* Given a key, deletes the first occurrence of key in linked list */
    public void deleteNode(int key){

        // Store head node
        Node temp=head;
        Node prev=null;

        // If head node itself holds the key to be deleted
        if(temp!=null && temp.data==key){
            head=temp.next;
            return;
        }
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while(temp!=null && temp.data!=key){
            prev=temp;
            temp=temp.next;
        }
        // If key was not present in linked list
        if(temp==null){
            return;
        }
        // Unlink the node from linked list
        prev.next=temp.next;
    }

    public void push(int newData){

        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }

    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }

    public static void main(String [] args){
        Deletion list=new Deletion();
        list.push(7);
        list.push(1);
        list.push(2);
        list.push(3);
        list.deleteNode(1);
        list.printList();
    }
}
