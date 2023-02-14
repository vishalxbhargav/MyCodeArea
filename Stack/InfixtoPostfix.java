package Stack;

import java.util.Collections;
import java.util.Stack;
public class InfixtoPostfix {
    public static String postfix(String str,Stack<String> stk){
        String result="";
       
        for(int i=0;i<str.length();i++){
            String temparary="";
            char ch=str.charAt(i);
            if(ch-'a'>=0&ch-'a'<=26){
                temparary=""+ch;
                stk.push(temparary);
            }else{
                if(ch=='('){
                    while(ch==')'){
                        
                    }
                }
                if(ch=='*'||ch=='/'){
                    stk.pop();
                    char temp=str.charAt(i-1);
                    char temp2=str.charAt(i+1);
                    temparary=""+temp+temp2+ch;
                    stk.push(temparary);
                    i++;
                }if(ch=='+'||ch=='-'){
                    temparary=""+ch;
                    stk.push(temparary);
                }
            }
        }
        Collections.reverse(stk);
        while(!stk.isEmpty()){
            String temp=stk.pop();
          
            if(temp.equals("+")||temp.equals("-")||temp.equals("*")||temp.equals("/")){
                String temp2=stk.pop();
                result=result+temp2+temp;
            }else{
                result=result+temp;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Stack<String> stk=new Stack<>();
        String str="a+b*c-d";
        System.out.println(postfix(str, stk));
    }
}
