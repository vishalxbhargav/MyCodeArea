package Stack;

import java.util.Stack;

public class PushatTheBottomofTheStack {
    public static void pusElement(Stack<Integer> stk,int ele){
        if(stk.isEmpty()){
            stk.push(ele);
            return;
        }
        int temp=stk.pop();
        pusElement(stk, ele);
        stk.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        System.out.println(stk);
        pusElement(stk, 0);
        System.out.println(stk);
    }
}
