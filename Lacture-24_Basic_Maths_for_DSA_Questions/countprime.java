import java.util.Arrays;

public class countprime {
    public static int prime(int n){
        boolean prime[]=new boolean[40];
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        int  cnt=0;
        for(int i=0;i<n;i++){
            if(prime[i]){
                cnt++;
            for(int j=i*i;j<n;j=j+i){
                prime[j]=false;
            }
            }
            
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(prime(40));
        
    }
}
