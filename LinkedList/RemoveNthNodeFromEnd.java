package LinkedList;
public class RemoveNthNodeFromEnd {
    static Node head;
    private static int size;
    RemoveNthNodeFromEnd(){
        size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        newNode.next=head;
        head=newNode;
    }
    public void deletefirst(int data){
        if(head==null){
            System.out.println("List is Empty");
        }
        size--;
        head.next=head;
    }
    public int getsize(){
        return size;
    }
    public void printlist(Node nhead){
        Node tem=nhead;
        while(tem!=null){
            System.out.println(tem+"-->");
            tem=tem.next;
        }
        System.out.print("null");
    }

    public static  void deleteeNthNode(int n){

    }
    public static void main(String[] args) {
        RemoveNthNodeFromEnd list=new RemoveNthNodeFromEnd();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        
        System.out.println(head);
        list.printlist(head);
    }
}
