public class bookAllowcation {
    static boolean isPossible(int nums[], int n, int m,int mid){ 
        int studentCoundt=1;
        int pageSum=0;
        for(int i=0;i<nums.length;i++){
            if(pageSum+nums[i]<=mid){
                pageSum+=nums[i];
            }else{
                studentCoundt++;
                if(studentCoundt>m||nums[i]>mid){
                    return false;
                }
                pageSum=nums[i];
                
            }
        }
        return true;
    }
    public static int findPages(int nums[],int n,int m){
        int s=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int e=sum;
        int ans=-1;
        int mid=s+(e-s)/2;
        while(s<=e){
           
            if(isPossible(nums, n, m, mid)){
                ans=mid;
                e=mid-1;
            }else{
                s=m+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;

    }
    
    
    public static void main(String[] args)
    {
 
        int arr[] = { 12, 34, 67,
                      90 }; // Number of pages in books
 
        int m = 2; // No. of students
 
        System.out.println("Minimum number of pages = " + findPages(arr, arr.length, m));
    }
}
