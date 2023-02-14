package Stack;
import java.util.Stack;
public class ValidParanthisesProblem {
    public static boolean validParenthes(String s){
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch=='('||ch=='['||ch=='{')){
                stk.push(ch);
            }else{
                    if ((ch == ')' && stk.peek() != '(')|| (ch == '}' && stk.peek() != '{')|| (ch == ']' && stk.peek() != '[')) {
                        return false;  // for a valid input, a close brackets must have an open brackets
                    }else if(stk.isEmpty()) return false;
                stk.pop();
            } 
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s="()";
        System.out.println(validParenthes(s));
    
    }
}
