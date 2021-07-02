package LinkedList.SinglyLinkedList;

public class Merge {
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

    Node sortedMerge(Node headA, Node headB){

        /* a dummy first node to hang the result on */
        Node dummyNode=new Node(0);
        /* tail points to the last result node */
        Node tail=dummyNode;
        while(true){
            /* if either list runs out, use the other list */
            if(headA== null){
                tail.next=headB;
                break;
            }
            if(headB==null){
                tail.next=headA;
                break;
            }
            /* Compare the data of the two lists whichever lists' data is smaller, append it into tail and advance the head to the next Node*/
            if(headA.data<=headB.data){
                tail.next=headA;
                headA=headA.next;
            }
            else{
                tail.next=headB;
                headB=headB.next;
            }

            tail=tail.next;

        }
        return dummyNode.next;
        
    }

    public static void main(String[] args) {
        Merge list=new Merge();
        Merge list2=new Merge();
        /* Let us create two sorted linked
            lists to test the methods
            Created lists:
                llist1: 5->10->15,
                llist2: 2->3->20
        */
        list.push(15);
        list.push(10);
        list.push(5);
        list2.push(20);
        list2.push(3);
        list2.push(2);
        list.printList();
        System.out.println();
        list2.printList();
        System.out.println();
        System.out.println("After Merging");
        list.head=list.sortedMerge(list.head, list2.head);
        list.printList();
    }
}
