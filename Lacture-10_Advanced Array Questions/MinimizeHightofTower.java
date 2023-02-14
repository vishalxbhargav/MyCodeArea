public class MinimizeHightofTower {
    public static int minimizehight(int arr[],int n,int k){
        int dif=arr[n-1]-arr[0];
        int min,max;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0) continue;
            
            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            min=Math.min(arr[0]+k,arr[i]-k);
            dif=Math.min(dif,max-min);
        }
        return dif;
    }
    public static void main(String[] args) {
        // int nums[]={3,9,12,16,20};
        int nums1[]={1,5,8,10};
        System.out.println(minimizehight(nums1, 4, 2));
    }
}
