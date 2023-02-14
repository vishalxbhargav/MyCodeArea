package Recursion;

public class RopCuttingProblem {
    public static int ropCutting(int n,int a,int b,int c){
        if(n==0) return 0;
        if(n<0) return -1;
        
        int res=Math.max(ropCutting(n-c, a, b, c),Math.max(ropCutting(n-a, a, b, c),ropCutting(n-b, a, b,c)));
        if(res==-1) return -1;
        return res+=1;
    }
    public static void main(String[] args) {
        System.out.println(ropCutting(23, 2, 12, 13));
    }
}
