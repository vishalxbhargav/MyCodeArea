public class DutchNationFlag {
    public static void sorting(int nums[]){
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;low++;
            }
            if(nums[mid]==1) mid++;
            if(nums[mid]==2){
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                mid++;high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,2,0,0,1,1,2,0,0,2,1,1,0};
        sorting(arr);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-\n");
    }
}
