package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void insert(Stack<Integer>stk,int temp){
        if(stk.size()==0){
            stk.push(temp);
            return;
        }
        int val=stk.pop();
        insert(stk,temp);
        stk.push(val);
    }
    public static void reverse(Stack<Integer>stk){
        if(stk.size()==1) return;
        int temp=stk.pop();
        reverse(stk);
        insert(stk,temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stk =new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        System.out.println(stk);
        reverse(stk);
        System.out.println(stk);
    }
}
