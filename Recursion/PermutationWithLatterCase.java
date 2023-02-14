package Recursion;
public class PermutationWithLatterCase{
    public static void permutationCaseChange(String input,String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String op1=""+output;
        String op2=""+output;
        char ch=input.charAt(0);
        int ch1=input.charAt(0);
        if(isAlphabate(ch1)){
            if(ch<=90||ch>=65){
                ch=(char)(ch-32);
            }else{
                ch=(char)(ch+32);
            }
            op1=op1+""+ch;
            op2=op2+input.charAt(0);
            input=input.substring(1);
            permutationCaseChange(input, op2);
            permutationCaseChange(input, op1);
        }else{
            op1=op1+input.charAt(0);
            op2=op2+input.charAt(0);
            input=input.substring(1);
            permutationCaseChange(input, op2);
        }
        return;
    }
    private static boolean isAlphabate(int ch1) {
        if(ch1<=57&&ch1>=48) return false;
        return true;
    }
    public static void main(String[] args) {
        String input="a1b2";
        String output="";
        permutationCaseChange(input, output);
    }
}