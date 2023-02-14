package Recursion;

public class PrintXtoPowerN {
    //Bruat Force Approch
    public static int power(int x,int n){
        if(n==0) return 1;
        int pow=x*power(x, n-1);
        return pow;
    }
    //Optimize Approch
    public static int Optimizepower(int x,int n){
        if(n==0) return 1;
        int halfPower=Optimizepower(x, n/2);
        int halfPowersq=halfPower*halfPower;
        if(n%2!=0){
            halfPowersq=x*halfPowersq;
        }
        return halfPowersq;
    }
    public static void main(String[] args) {
        System.out.println(Optimizepower(2, 5));//Output-32
        System.out.println(power(2, 5));//Output-32
    }
}
