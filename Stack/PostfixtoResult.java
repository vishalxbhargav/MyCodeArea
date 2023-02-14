package Stack;

import java.util.Stack;

public class PostfixtoResult {
    private static boolean isDigit(int ch1) {
        if(ch1<=9&&ch1>=0) return true;
        return false;
    }
    public static int infix(Stack<Integer> stk, String str) {
        int result;
        for(int i=0;i<str.length();i++){
            int ch1=str.charAt(i)-'0';
            char ch=str.charAt(i);
            if(isDigit(ch1)){
                stk.push(ch1);
            }else{
                int n1=stk.pop();
                int n2=stk.pop();
                if(ch=='+'){
                    int temp=n1+n2;
                    stk.push(temp);
                }else if(ch=='-'){
                    int temp=n1-n2;
                    stk.push(temp);
                }else if(ch=='*'){
                    int temp=n1*n2;
                    stk.push(temp);
                }else{
                    int temp=n1/n2;
                    stk.push(temp);
                }
            }
        }
        result=stk.peek();
        return result;
    }
    public static void main(String[] args) {
        String postfix="123*+";
        Stack<Integer> stk=new Stack<>();
        System.out.println(infix(stk,postfix));
        
    }
}
