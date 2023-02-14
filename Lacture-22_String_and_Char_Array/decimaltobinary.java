public class decimaltobinary {
    public static String coversion(int n){
        String s="";
        while(n!=0){
            s=(n%2)+s;
            n=n/2;
        }
        return s;
    }
    public static void main(String[] args) {
        int x=12;
        System.out.println(coversion(x));
    }
}
