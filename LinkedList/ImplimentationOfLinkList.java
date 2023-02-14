package LinkedList;

public class ImplimentationOfLinkList {
    static Node head;
    private static int size;
    ImplimentationOfLinkList(){
        ImplimentationOfLinkList.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
       head =newNode;
    }
    public void addLast(String data){
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
    public void printList(){
       if(head==null) System.out.println("List is Empty");
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" --> ");
            currNode=currNode.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void firstDelete(){
        if(head==null) System.out.println("list is empty");
        size--;
        head=head.next;
    }
    public void lastDelete(){
        if(head==null) System.out.println("list is empty");
        size--;
        if(head.next==null){
            head=null;
            return;
        } 
        Node lastnode=head.next;
        Node secondlast=head;
        while(lastnode.next!=null){
           lastnode=lastnode.next;
           secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public int getSize(){
        return size;
    }
    public void reverseIterative(){
        Node previesNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nexNode=currNode.next;
            currNode.next=previesNode;

            previesNode=currNode;
            currNode=nexNode;
        }
        head.next=null;
        head=previesNode;
    }
    public static void main(String[] args) {
        ImplimentationOfLinkList list=new ImplimentationOfLinkList();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");

        list.printList();
        list.reverseIterative();
        list.printList();

    }
}
