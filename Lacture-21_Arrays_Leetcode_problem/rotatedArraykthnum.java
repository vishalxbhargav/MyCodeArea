public class rotatedArraykthnum {
    public static void rotated(int nums[],int k){
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[(i+k)%nums.length]=nums[i];
        }
        nums=temp;
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        rotated(nums,3);
    }
}
