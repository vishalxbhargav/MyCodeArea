package BitManupulation;

public class CountBits {
    public static int countBit(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=0;
            while(arr[i]>0){
                if((arr[i]&1)!=0) count++;
                arr[i]=arr[i]>>1;
                
            }
            arr[i]=count;
        }
        
        return 0;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};//   10111
        System.out.println(countBit(nums));
        for(int i:nums) 
            System.out.println(nums[i]);

    }
}