package LinkedList.SinglyLinkedList;

// A complete working Java program to delete a node in a linked list at a given position
public class Deletion2 {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }

     /* This function prints contents of linked list starting from
        the given node */
    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.println(n.data);
        }
    }

    /* Given a reference (pointer to pointer) to the head of a list
       and a position, deletes the node at the given position */
    public void delete(int position){
        
        // If linked list is empty
        if(head==null){return;}

        Node temp=head;

        // If head needs to be removed
        if(position==0){
            head=temp.next;
            return;
        }
        // Find previous node of the node to be deleted
        for(int i=0; temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        // If position is more than number of nodes
        if(temp==null || temp.next==null){
            return;
        }
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next=temp.next.next;
        temp.next=next; // Unlink the deleted node from list

    }
    
}
