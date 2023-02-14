public class margtwoarray {
    public static void marg(int arr1[],int n,int arr2[],int m,int arr3[]){
        int i=0,j=0,k=0;
        while( i<n && j<m) {
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                k++;
                i++;
            }
            else{
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
    
        //copy first array k element ko
        while(i<n) {
            arr3[k] = arr1[i];
            k++;
            i++;
        }
    
        //copy kardo second array k remaining element ko
        while(j<m) {
            arr2[k] = arr2[j];
            k++;
            i++;
        }
        for(int d:arr3){
            System.out.println(arr3[d]);
        }

    }
    public static void main(String[] args) {
        int nums1[]={3,5,7,9,11};
        int nums2[]={2,4,6,8,10};
        int nums3[]=new int[nums1.length+nums2.length];
        marg(nums1, nums1.length, nums2, nums2.length, nums3);
       
    }
}
