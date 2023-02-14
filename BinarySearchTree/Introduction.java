package BinarySearchTree;
public class Introduction {
    public static int binaraySearch(int nums[],int key){
        int s=0,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==key) return mid;
            else if(nums[mid]<key) s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(binaraySearch(arr, 7));
        
    }
}
