package LinkedList;

public class MergeTwoSortedList {
    static  Node  head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static  void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
       head =newNode;
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
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
    public static void print(Node dummy){
        Node n=dummy; 
        while(n!=null){
            System.out.print(n.data+"-->");
            n=n.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static Node mergetwo(Node head1,Node head2){
        Node dumm1=head1,dumm2=head2; 
        Node result;
        if(dumm1.data<dumm2.data){
            result=dumm1;
        }else{
            result=dumm2;
        }

      
        while(dumm1!=null||dumm2!=null){

            if(dumm1.data<=dumm2.data){
                
                result.next=dumm1;
                dumm1=dumm1.next;
                
            }else{
                
                result.next=dumm2;
                dumm2=dumm2.next;
                
            }

        }
        result.next=null;
        return result;

    }
    public static void main(String[] args) {
        addLast(1);
        addLast(5);
        addLast(3);
        addLast(6);
        addLast(2);
        addLast(7);
        addLast(10);
        addLast(8);
        addLast(4);
        addLast(9);
        Node head2=head.next.next.next;
        print(head2);
        
        head.next.next.next.next=null;
        print(head);
        Node pr=mergetwo(head, head2);
        print(pr);
       
    }
}
