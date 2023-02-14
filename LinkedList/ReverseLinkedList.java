package LinkedList;

public class ReverseLinkedList {
    static Node head;
    class Node{
        int num;
        Node next;
        Node(int data){
            this.num=data;
            this.next=null;
        }
    }
    public void addFirst(int i){
        Node newNode = new Node(i);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
       head =newNode;
    }
    public void addLast(int i){
        Node newNode = new Node(i);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList(){
        
        if(head==null) System.out.println("List is Empty");
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode+" -->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseLinkedList list=new ReverseLinkedList();
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addFirst(1);
        list.addFirst(1);
        System.out.println();
        list.printList();
    }
}
