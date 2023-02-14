public class reversearray1 {
    public static void reverse(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            swap(arr[s],arr[e]);
            s++;
            e--;
        }
    }
    private static void swap(int start,int end) {
        int temp=start;
        start=end;
        end=temp;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9};
        reverse(nums);
        for(int i:nums){//for each loop
            System.out.println(nums[i]);
        }
        int a=10;
        int b=20;
        swap(a, b);
        
    }

       
}
