package Recursion;

public class PrintAllSubSequenceOfString {
    public static void solve(String input, String output) {
        if(input.isEmpty()){
            System.out.print(output+"");
            return;
        }
        String op1=" "+output;
        String op2=" "+output;
        op1=op1+input.charAt(0);
        input=input.substring(1);
        solve(input, op1);
        solve(input, op2);
        return;

    }
    public static void main(String[] args) {
        String input = "ab";
        String output="";
        solve(input,output);

    }
}
