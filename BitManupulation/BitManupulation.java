package BitManupulation;

public class BitManupulation {
    public static void showOddEven(int nums[]){
        int bitmask=1;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & bitmask) == 0){
                System.out.println(nums[i]+" is even number");
            }else{
                System.out.println(nums[i]+" is odd number");
            } 
        }
        
    }
    public static int getithbit(int n,int i ){
        int bitmask=(1<<i);
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int  bitmask=(1<<i);
        return (n|bitmask);
    }
    public static int clearIthBit(int n,int i){
        int  bitmask=~(1<<i);
        return (n&bitmask);
    }
    public static void main(String[] args) {
        // System.out.println("---Bitwise Operator");

        // System.out.println(5&2);
        // System.out.println(5^2);
        // System.out.println(5|1);
        // System.out.println(~5);

        // System.out.println(25<<2);
        // System.out.println(25>>2);
        System.out.println(getithbit(12, 3));
        System.out.println(setIthBit(12, 5));
        System.out.println(clearIthBit(12, 3));
    }
}
