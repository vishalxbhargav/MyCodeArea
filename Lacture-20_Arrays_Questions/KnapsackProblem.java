public class KnapsackProblem {
    public static boolean solve(int arr[]){
        int sum=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            temp+=arr[i];
            if(temp>sum-temp){
                temp=temp-arr[i];
            }
            if(temp==sum-temp) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // int arr[]={1,5,11,5};
        int arr2[]={1,2,3,4,5,6,7};
        // System.out.println(solve(arr));
        System.out.println(solve(arr2));
        
    }
}

