public class Swapingfunction {
    static void swaping(int x,int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println("function for swap");
    }
    public static void main(String[] args) {
        int a=10;int b=39;
        swaping(a, b);
        System.out.println(a+" "+b);
    }
}
