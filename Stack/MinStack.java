package Stack;

import java.util.Stack;

public class MinStack {
    static Stack<Integer> stk=new Stack<>();
    static Stack<Integer> sstk=new Stack<>();
    public static int min(){
        if(stk.size()==0) return -1;
        else return sstk.peek();
    }
    public static void push(int x){
        stk.push(x);
        if(sstk.size()==0) sstk.push(x);
        else if(stk.peek()<=sstk.peek()) sstk.push(x);
    }
    public static void pop(){
        if(sstk.peek()<=stk.peek()) sstk.pop();
        stk.pop();
    }
    public static void main(String[] args) {
        push(5);
        push(3);
        push(7);
        push(1);
        push(8);
        System.out.println(min());
    }
}
