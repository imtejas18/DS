package LinkedList.SinglyLinkedList;

public class SwapNode {
    
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
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }

    public void swap(int x, int y){
        Node node1=head;
        Node node2=head;
        Node prevNode1=null;
        Node prevNode2=null;

        // Check if list is empty
        if(head==null){
            return;
        }
        // Check if x and y are same then list will remain same
        if(x==y){
            return;
        }

        //Search for node1
        while(node1!= null && node1.data!=x){
            prevNode1=node1;
            node1=node1.next;
        }
        //Search for node2
        while(node2!= null && node2.data!=y){
            prevNode2=node2;
            node2=node2.next;
        }

        if(node1 !=null && node2 != null){

            // If previous node to node1 is not null then,
            // it will point to node2
            if(prevNode1!=null){
                prevNode1.next=node2;
            }
            else{
                head=node2;
            }

            // If previous node to node2 is not null then,
            // it will point to node1
            if(prevNode2!=null){
                prevNode2.next=node1;
            }
            else{
                head=node1;
            }

            // Swaps the next nodes of node1 and node2
            Node temp=node1.next;
            node1.next=node2.next;
            node2.next=temp;
        }
        else{
            System.out.println("Swapping is not possible");
        }

    }

    public static void main(String[] args) {
        SwapNode list=new SwapNode();
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.printList();
        list.swap(2,5);
        System.out.println();
        list.printList();
    }
}
