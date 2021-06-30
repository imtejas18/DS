package LinkedList.SinglyLinkedList;

public class Reverse {
    
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void push(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    Node reverse(Node node){
        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node=prev;
        return node;
    }

    public static void main(String[] args) {
        Reverse list=new Reverse();
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.printList();
        head=list.reverse(head);
        System.out.println();
        list.printList();
    }

}
