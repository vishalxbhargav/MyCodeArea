package Recursion;

public class PrintNbiBinaryNumberhavingmore1sthen0sforAnyPrefix{
    public static void solve(int one,int zero,String output, int n) {
        if(n==0){
            System.out.println(output);
            return;
        }
        String op1=output;
        op1+="1";
        solve(one+1, zero, op1, n-1);
        if(one>zero){
            String op2=output;
            op2+="0";
            solve(one, zero+1, op2, n-1);
        }
        return;
    }
    public static void main(String[] args) {
        String str="";
        int n=5;
        int one=0,zero=0;
        solve(one,zero,str,n);
    }

    
}
