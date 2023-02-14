package Recursion;

import java.util.HashSet;

public class PrintUniqueSubsetandVariation{ 
    public static void solve(String input, String output,HashSet<String> set) {
        if(input.length()==0){
            set.add(output);
            return;
        }
        String op1=""+output;
        String op2=""+output;
        op2=op2+input.charAt(0);
        input=input.substring(1);
        solve(input, op2,set);
        solve(input, op1,set);
        
        return;
    }

    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        String input="1213";
        String output="";
        solve(input,output,set);
        System.out.println(set);
    }

   
}