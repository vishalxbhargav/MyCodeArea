package Recursion;

public class PermutationWithCaseChange {
    public static void permutationCaseChange(String input,String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String op1=""+output;
        String op2=""+output;
        char ch=(char) (input.charAt(0)-32);
        op1=op1+""+ch;
        op2=op2+input.charAt(0);
        input=input.substring(1);
        permutationCaseChange(input, op2);
        permutationCaseChange(input, op1);
        
        return;
    }
    public static void main(String[] args) {
        String input="ab";
        String output="";
        permutationCaseChange(input, output);
    }
}
