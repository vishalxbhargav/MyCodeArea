package LinkedList;

import java.util.LinkedList;

public class CollectionLinkList {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(1);
        list.addLast(2);
       
        list.addAll(7, list);
        list.addAll(5, list);
        list.addAll(6, list);
        list.addAll(7, list);
        list.addAll(8, list);
        System.out.println(list);
    }
}
