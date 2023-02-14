public class movizeroes {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void moves(int nums[]){
        int nonzero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums[nonzero], nums[i]);
                nonzero++;
            }

        }
    }
    public static void main(String[] args) {
        int nums[]={0,1,0,3,0,12,0,0};
        moves(nums);
        for(int i:nums){
            System.out.print(" "+nums[i]);
        }

    }
}
