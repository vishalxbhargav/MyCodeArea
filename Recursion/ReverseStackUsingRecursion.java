package Recursion;
import java.util.Stack;
public class ReverseStackUsingRecursion {
    public static void reverseStack(Stack<Integer> stk){
        if(stk.size()==1) return;
        int temp=stk.pop();
        reverseStack(stk);
        insert(stk, temp);
    }
    public static void insert(Stack<Integer> stk, int temp) {
        if(stk.size()==0){
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
        System.out.println(stk);
        reverseStack(stk);
        System.out.println(stk);
    }
}
