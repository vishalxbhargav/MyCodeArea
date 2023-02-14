package Recursion;

import java.util.Stack;

public class SortStackByUsingRecursion {
    public static void sorting(Stack<Integer> stk){
        if(stk.size()==1) return;
        int temp=stk.pop();
        sorting(stk);
        insert(stk,temp);
    }
    private static void insert(Stack<Integer> stk, int temp) {
        if(stk.size()==0||stk.peek()<=temp){
            stk.push(temp);
            return;
        }
        int val=stk.pop();
        insert(stk, temp);
        stk.push(val);

    }
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(0);
        stk.push(5);
        stk.push(1);
        stk.push(2);
        stk.push(9);
        stk.push(4);
        stk.push(3);
        sorting(stk);
        System.out.println(stk);
        // System.out.println(stk.size());
    
        

    }
}
