package LinkedList.SinglyLinkedList;

public class Count {
    
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

    /*Iterative Method */
    /* Returns count of nodes in linked list */
    public int getCount(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    /*Recursive Method */
    public int getCountRec(Node node){
        if(node==null){
            return 0;
        }
        else{
            return 1+getCountRec(node.next);
        }
    }

    public int getCount1(){
        return getCountRec(head);
    }

    public static void main(String[] args) {
       Count list=new Count();
       list.push(20); 
       list.push(15);
       list.push(10);
       list.push(5);
       System.out.println("Count of node is "+ list.getCount());
       System.out.println("Count of node is "+ list.getCount1());
    }
}
