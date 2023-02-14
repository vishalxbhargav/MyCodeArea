public class firstandlast {
    public static int firstOccurance(int nums[],int k){
        int s=0;
        int e=nums.length-1;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(nums[mid]==k){
                ans=mid;
                e=mid-1;
            }else if(k>nums[mid]){
                s=mid+1;
            }else{
                e=mid-1;
            }

            mid=s+(e-s)/2;
        }
        return ans;
    }
    public static int lastOccurance(int nums[],int k){
        int s=0;
        int e=nums.length-1;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(nums[mid]==k){
                ans=mid;
                s=mid+1;
            }else if(k>nums[mid]){
                s=mid+1;
            }else{
                e=mid-1;
            }

            mid=s+(e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,5};
        int first=firstOccurance(arr, 3);
        int last=lastOccurance(arr, 3);
        System.out.println("first Occurance of 3 index "+first);
        System.out.println("last Occurance of 3 index "+last);

    }
    
}
