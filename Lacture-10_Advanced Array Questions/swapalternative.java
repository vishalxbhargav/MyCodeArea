public class swapalternative {
    public static void swap(int arr[]){
        for(int i=0;i<arr.length;i=i+2){
            if(i+i<arr.length){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int nums[]={12,45,5,34,6,7,8,54,14};
        int num[]={1,2,3,4,5};
        swap(nums);
        System.out.println();
        swap(num);
    }
}
