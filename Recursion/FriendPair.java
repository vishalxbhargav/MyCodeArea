package Recursion;

public class FriendPair {
    public static int pair(int n){
        if(n==2||n==1) return n;
        return pair(n-1)+(n-1)*pair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}
