package Stack;

public class RainWaterTraiping {
    public static int solve(int arr[]){
        int result=0;
        int mxl[]=new int [arr.length];
        mxl[0]=arr[0];
        int mxr[]=new int [arr.length];
        for(int i=1;i<arr.length;i++){
            mxl[i]=Math.max(mxl[i-1],arr[i]);
        }
        mxr[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            mxr[i]=Math.max(mxr[i+1],arr[i]);
        }
        for(int i=1;i<arr.length;i++){
            result+=Math.min(mxl[i],mxr[i])-arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={3,0,0,2,0,4};
        int arr1[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int arr2[]={7 ,0, 4, 2, 5, 0, 6, 4, 0, 6};
        System.out.print(solve(arr));
        System.out.println();
        System.out.print(solve(arr1));
        System.out.println();
        System.out.print(solve(arr2));
    }
}
