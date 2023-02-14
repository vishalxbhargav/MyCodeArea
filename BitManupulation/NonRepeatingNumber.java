package BitManupulation;

public class NonRepeatingNumber {
    public static int nonRepeating(int nums[]){
        int xorSum=0;
        for(int i=0; i<nums.length; i++)
        xorSum^=nums[i];
        int set_bit = (xorSum & ~(xorSum-1));
        int x=0, y=0;
        
        for(int i=0; i<nums.length; i++){
                if((set_bit&nums[i])==1)
                    x^=nums[i];
                else
                    y^=nums[i];
        }
        System.out.println(x+""+y);
        return 0;
}
    public static void main(String[] args) {
        int arr[] = {2,7,11,32,11,7, 8, 2};
        System.out.println(nonRepeating(arr));
    }
}
