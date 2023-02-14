public class search2darray {
    public static boolean search(int arr[][],int target){
        int row=arr.length;
        int col=arr[0].length;
        int s=0,e=row*col-1;
        
        while(s<=e){
            int mid=s+(e-s)/2;
            int element=arr[mid/col][mid%col];
            if(element==target) return true;
            if(element<target){
                s=mid+1;
            }else{
                e=mid-1;
            } 
        }
        return false;

    }
    public static void main(String[] args) {
        int nums[][]={{2,5,7},{12,15,23},{30,42,50}};
        boolean result=search(nums, 23);
        if(result){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not Found");
        }
    }
}
