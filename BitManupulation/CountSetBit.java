package BitManupulation;

public class CountSetBit {
    public static int countBit(int x){
        int count=0;
        while(x>0){
            if((x&1)!=0) count++;
            x=x>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=32;//   10111
        System.out.println(countBit(n));

    }
}
