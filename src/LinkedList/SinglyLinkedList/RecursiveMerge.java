package LinkedList.SinglyLinkedList;

public class RecursiveMerge {
    
    Node head;

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

    public Node sortedMerge(Node A, Node B){
        
        if(A==null){
            return B;
        }
        if(B==null){
            return A;
        }
        if(A.data<B.data){
            A.next=sortedMerge(A.next, B);
            return A;
        }
        else{
            B.next=sortedMerge(A, B.next);
            return B;  
        }

    }

    public static void main(String[] args) {
        RecursiveMerge list=new RecursiveMerge();
        RecursiveMerge list2=new RecursiveMerge();
        RecursiveMerge list3=new RecursiveMerge();
        list.push(15);
        list.push(10);
        list.push(5);
        list2.push(20);
        list2.push(3);
        list2.push(2);
        list.printList();
        System.out.println();
        list2.printList();
        list3.head=list.sortedMerge(list.head,list2.head);
        System.out.println();
        System.out.println("After merging");
        list3.printList();
    }
}
