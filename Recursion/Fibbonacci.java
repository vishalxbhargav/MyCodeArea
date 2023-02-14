package Recursion;

public class Fibbonacci {
    public static int fibbo(int n){
        if(n==0||n==1) return n;
        int fibnum=fibbo(n-1)+fibbo(n-2);
        return fibnum;
    }
    public static void main(String[] args) {
        System.out.println(fibbo(6));
    }
}
