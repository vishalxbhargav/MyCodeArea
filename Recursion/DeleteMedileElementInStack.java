package Recursion;

import java.util.Stack;

public class DeleteMedileElementInStack {
    public static void solve(Stack<Integer> stk, int k) {
        if(k==1){
            stk.pop();
            return;
        }
        int temp=stk.pop();
        solve(stk, k-1);
        stk.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stk =new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(0);
        stk.push(6);
        stk.push(7);
        int k=(stk.size()/2)+1;
        System.out.println(stk);
        solve(stk,k);
        System.out.println(stk);
    }

    
}
