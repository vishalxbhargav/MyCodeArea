public class sumofarray{
    public static void sum(int nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum= sum+nums[i];
        }
        System.out.println("The Sum Of an array is ="+ sum);
    }
    public static void main(String[] args) {
        int nums[]={12,45,5,34,6,7,8,54,14};
        sum(nums);
    }
}