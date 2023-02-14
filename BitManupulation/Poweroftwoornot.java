package BitManupulation;

public class Poweroftwoornot {
 
    public static boolean checkPower(int n){
        if((n&(n-1))!=0) return false;
        return  true;
    }
    public static void main(String[] args) {
        System.out.println(checkPower(6));

    }
}
