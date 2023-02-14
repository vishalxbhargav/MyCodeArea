package Recursion;

public class Recursion {
    public static void printIncre(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncre(n-1);
        System.out.println(n);
    }
    public static void printDecre(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printDecre(n-1);
    }
    public static void main(String[] args) {
        printIncre(10);
        System.out.println("-----------");
        printDecre(10);
    }
}
