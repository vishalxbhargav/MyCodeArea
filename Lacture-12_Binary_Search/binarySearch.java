public interface binarySearch {
    public static int serch(int nums[],int k){
        int start=0;
        int end=nums.length-1;
        int mid=(start+end)/2;
        while(mid<=end){
            if(nums[mid]==k){
                return mid;
            }else if(nums[mid]>k){
                end=mid-1;
            }else{
                start=mid+1;
            }
            mid=(start+end)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={5,8,11,15,21,28,44,55,60};
        int result=serch(nums, 28);
        System.out.println(result);
    }
}
