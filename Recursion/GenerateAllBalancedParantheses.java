package Recursion;

import java.util.ArrayList;

public class GenerateAllBalancedParantheses {
    public static void solve(int open, int close, String output, ArrayList<String> arr) {
        if(open==0&&close==0){
            arr.add(output);
            return;
        }
        if(open!=0){
            String op1=output;
            op1=op1+"(";
            solve(open-1, close, op1, arr);
        }
        if(open<close){
            String op2=output;
            op2=op2+")";
            solve(open, close-1, op2, arr);
        }
        return ;
    }
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        int open=3;
        int close=3;
        String output="";
        solve(open, close, output, arr);
        System.out.println(arr);
    }

   
}
