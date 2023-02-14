public class sortbinaryelement {
    public static void sortel(int arr[],int n){
        int i=0;
        int j=n-1;
        while(i<j){
            while(arr[i]==0){
                i++;
            }
            while(arr[j]==1){
                j--;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;i<n;k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args) {
        int nums[]={1,1,0,0,0,1,0};
        sortel(nums,nums.length);
    }
    
}
