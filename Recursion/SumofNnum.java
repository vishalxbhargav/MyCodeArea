package Recursion;

public class SumofNnum {
    public static int sumofNumber(int n){
        int sum;
        if(n==1) return 1;
        sum=n+sumofNumber(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofNumber(5));
    }
}
