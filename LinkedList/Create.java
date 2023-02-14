package LinkedList;

public class Create {
    static  Node  head;
    static Node tail;
    private static int size;
    Create(){
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
    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
       head =newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=tail=newNode;

    }
    public void printList(Node temhead){
        if(head==null) System.out.println("List is Empty");
         Node currNode=temhead;
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
        tail=secondlast;
        secondlast.next=null;
    }
    public int getSize(){
        return size;
    }
    public void deleteeNthNodeFromEnd(Node head,int k){
        if(head==null){
            return;
        }
        Node tempnode=head;
        int listsize=0;
        while(tempnode!=null){
            listsize++;
            tempnode=tempnode.next;
        }
        Node previes=head;
        int i=1;
        while(i<listsize-k){
            previes=previes.next;
            i++;
        }
        size--;
        previes.next=previes.next.next;
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
    public Node reverseRecursivley(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newNode=reverseRecursivley(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;

        
    }
    public Node medileElement(Node n){
        Node slow=n;
        Node fast=n;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }
    public boolean ispalindrom(Node n){
        Node midle=medileElement(n);
        Node first=head;
        Node secNode=reverseRecursivley(midle);
        while(secNode!=null){
            if(secNode.data!=first.data){
                 return false;
            }
            first=first.next;
            secNode=secNode.next;
        }
        return true;
    }
    public void addMid(int i,int data){
        Node n=new Node(data);
        Node dum=head;
        for(int j=2;j<i;j++){
            dum=dum.next;
        }
        n.next=dum.next;
        dum.next=n;
    }
    public void deleteNthNode(int i){
        Node dum=head;
        for(int j=2;j<i;j++){
            dum=dum.next;
        }
        dum.next=dum.next.next;
    }
    public void deleteGivenNode(Node n){
        n.data=n.next.data;
        n.next=n.next.next;
    }
    public int searchRecursivly(Node n,int key){
        if(n==null){
            return -1;
        }
        if(n.data==key){
            return 1;
        }
        int idx=searchRecursivly(n.next, key);
        if(idx==-1) return -1;
        return idx+1;
    }
    public boolean isCycle(Node head){
        Node fast=head,slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }
    public void removeCycle(Node head){
        Node fast=head,slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) break;
        }
        fast=head;
        Node pre=null;
        while(fast!=slow){
            pre=slow;
            fast=fast.next;
            slow=slow.next;
        }
        pre.next=null;
    }
    public Node  getmid(Node n){
        Node fast=n,slow=n;
        fast=fast.next;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node mergesort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node mid=getmid(head);
        Node righthf=mid.next;
        mid.next=null;
        Node left=mergesort(head.next);
        Node newright= mergesort(righthf);
        return mergelink(left,newright);

    }
    public Node mergelink(Node l1,Node l2){
        if(l1==null)return l2;
        if(l2==null)return l1;
        
        Node temp;
        
        if(l1.data<=l2.data){
            temp=l1;
            l1=l1.next;
        }else{
            temp=l2;
            l2=l2.next;
        }
        Node ansNode=temp; 
        
        
        while(l1!=null && l2!=null){
            if(l1.data<=l2.data){
                temp.next=l1;
                l1=l1.next;
            }else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1==null){
            temp.next=l2;
        }else{
            temp.next=l1;
        }
        
        return ansNode;
        
    }
    public static void main(String[] args) {
        Create list=new Create();
        list.addFirst(32);
        list.addLast(13);
        list.addLast(4);
        list.addLast(8);
        list.addLast(6);
        list.addLast(17);
        list.addLast(3);
        list.addLast(9);
        list.addFirst(10);
        // list.addMid(7, 12);

        list.printList(
            head
        );
        // Node hh=head.next.next.next.next.next.next;
        // head.next.next.next.next.next.next.next=null;


        // list.printList(list.mergelink(head
        // , hh));
        list.printList(list.getmid(head));
        // Node k=list.mergesort(head);
        // list.printList(k);
    
        // System.out.println( list.searchRecursivly(head, 12));
        // list.addMid(3, 5);
        // list.deleteGivenNode(head);
        // list.deleteNthNode(4);
        // list.deleteeNthNodeFromEnd(head, 3);
        // list.addLast(1);
        // list.addLast(2);
        // list.addLast(3);
        // list.addLast(4);
        // list.addLast(5);
        // System.out.println(head.data);
        // System.out.println(list.isCycle(head));
        // list.removeCycle(head);
        // System.out.println(list.isCycle(head));
        // // list.printList(head);
        // Create.head=list.reverseRecursivley(head);
        // list.printList(head);
        // System.out.println(list.medileElement(head));
        // list.printList(list.medileElement(head));
        // list.printList(head);
        // System.out.println( list.ispalindrom(head));
        // list.printList(head.next.next.next.next);
    }
}
