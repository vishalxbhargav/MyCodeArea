package BitManupulation;
public class Revesebi {
    public  static int reveseBit(int n){
        // int result = 0;
        // int mask = 1;
        // for (int i = 0; i < 32; i ++) {
        //     int digit = n & mask;
        //     result = (result << 1);
        //     if (digit != 0) {
        //         result = result + 1;
        //     }
        //     mask = (mask << 1);
        // }
        // return result; 
        int res=0;
        for(int i=0;i<32;i++){
            res= ( res << 1 ) | ( n & 1 );
            n = n >> 1;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(reveseBit(43261596));
    }
}
