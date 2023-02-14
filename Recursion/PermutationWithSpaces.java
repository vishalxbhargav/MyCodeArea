package Recursion;

public class PermutationWithSpaces {
    public static void permutation(String input,String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String op1=""+output;
        String op2=""+output;
        op1=op1+"_"+input.charAt(0);
        op2=op2+input.charAt(0);
        input=input.substring(1);
        permutation(input, op1);
        permutation(input, op2);
        return;
    }
    public static void main(String[] args) {
        String input="ABCDEF";
        String output="";
        output=""+input.charAt(0);
        input=input.substring(1);
        permutation(input, output);
    }
}
