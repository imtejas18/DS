package LinkedList.SinglyLinkedList;

public class MergeSort {
    
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
    public static Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node middle=getMiddle(head);
        Node nextOfMiddle=middle.next;
        middle.next=null;
        Node left=mergeSort(head);
        Node right=mergeSort(nextOfMiddle);
        Node sortedList=sortedMerge(left, right);
        return sortedList;
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static Node getMiddle(Node h){
        if(h==null){
            return h;
        }
        Node slow=h;
        Node fast=h;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node sortedMerge(Node A, Node B){
        
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
        MergeSort list=new MergeSort();
        list.push(30);
        list.push(50);
        list.push(10);
        list.push(60);
        list.push(20);
        list.push(40);
        list.printList();
        list.head=MergeSort.mergeSort(list.head);
        System.out.println();
        System.out.println("After Merge Sort");
        list.printList();
       
    }

}
