public class findUnique {
    public static int finduni(int[] arr){
        int ans=0;
		for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
      
    public static void main(String[] args) {
        int arr[]={2,3,1,6,3,6,2};
        int result=finduni(arr);
        System.out.println(result);
    }
    
}
