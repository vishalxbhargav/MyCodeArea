package Stack;
import java.util.Stack;
public class DecodeAString {
    public static String decode(String str){
       
        Stack<String> stk=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i); 
            String temp="";
            if(isCharacter(ch)||ch-'0'>=0&&ch-'0'<=9||ch=='['){
                String tem=""+ch;
                stk.push(tem);
            }else{
                while(!stk.isEmpty()&&!stk.peek().equals("[")){
                    temp+=stk.pop();
                }
                // reverse(temp);
                stk.pop();
                int n=numsbere(stk.pop());
                String tem2=""+temp;
                for(int j=1;j<n;j++){
                    temp+=tem2;
                }
               
                if(stk.isEmpty()) return reverse(temp);
                stk.push(temp);
            }
        }
        String result="";
        while(!stk.empty()){
            result+=stk.pop();
        }
        return result;
    }
    private static String reverse(String temp) {
        String sk="";
        for(int i=temp.length()-1;i>=0;i--){
            sk+=temp.charAt(i);
        }
        return sk;
    }

    private static int numsbere(String s) {
        switch (s) {
            case "1": 
                return 1;
            case "2": 
                return 2;
            case "3": 
                return 3;
            case "4": 
                return 4;
            case "5": 
                return 5;
            case "6": 
                return 6;
            case "7": 
                return 7;
            case "8": 
                return 8;
            case "9": 
                return 9;
            default:
                break;
        }
        return 0;
    }
    private static boolean isCharacter(char ch) {
        if(ch-'a'<=25&&ch-'a'>=0) return true;
        return false;
    }
    public static void main(String[] args) {
        // String strr="3[b2[v]]L";//Output:-bvvbvvbvv
        String strr="2[cv]";
        System.out.println(decode(strr));
    }
}
