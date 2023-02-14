package Stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static StringBuilder reverse(StringBuilder str,Stack<Character>stk){
        if(str.length()==1){
            return str;
        }
        stk.push(str.charAt(0));
        str.deleteCharAt(0);
        reverse(str, stk);
        str.append(stk.pop());
        return str;

    }
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder();
        str.append("vishal");
        Stack<Character> stk=new Stack<>();
        System.out.println( reverse(str,stk));
    }
}
