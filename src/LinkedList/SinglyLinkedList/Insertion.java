package LinkedList.SinglyLinkedList;

public class Insertion {
    
    Node head;
    
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }

    }
    /*Inserts a new Node at front of the list */
    public void push(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
        
    }
    /*Inserts a new node after the given prev_node. */
    public void insertAfter(Node previousNode, int newData){
        Node newNode=new Node(newData);
        newNode.next=previousNode.next;
        previousNode.next=newNode;
    }

    /* Appends a new node at the end. */
    public void append(int newData){
        Node newNode=new Node(newData);
        if(head==null){
            head=new Node(newData);
            newNode.next=null;
        }
        else{
            Node last=head;
            while(last.next !=null){
                last=last.next;
            }
            last.next=newNode;      
        }
    }

    public static void main(String args[]){
        Insertion list=new Insertion();
        list.append(10);
        list.push(5);
        list.append(20);
        list.insertAfter(list.head.next, 15);
        list.printList();
    }
}
