public class rotedsortedarrypivot {
    public static int pivot(int arr[]){
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        while (s < e)
        {
            if (arr[mid] >= arr[0])
            {
                s = mid + 1;
            }
            else
            {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        return s;
    }
    public static int search(int nums[],int s,int e,int k){
        int start=s;
        int end=e;
        int mid=(start+end)/2;
        int ans=-1;
        while(mid<=end){
            if(nums[mid]==k){
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
    public static int findpossition(int nums[],int n,int k){
        int pivotindex = pivot(nums);
        if(k>nums[pivotindex]&&k<=nums[n-1]){
            return search(nums,pivotindex,n-1,k);
        }else{
            return search(nums,0,pivotindex,k);
        }
        

    }
    public static void main(String[] args) {
        int nums[]={7,9,1,2,3};
        int k=2;
        System.out.println(pivot(nums));
        int result=findpossition(nums, 5, k);
        System.out.println(result);
        
    } 
}

