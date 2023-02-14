public class sumoftwoarray {
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        int digit1 = 0, digit2 = 0;
        for(int i=0;i<n;i++){
            digit1 = digit1*10 +a[i];
        }
         for(int i=0;i<m;i++){
            digit2 = digit2*10 +b[i];
         }
        int sum = digit1 + digit2;
        digit1 = sum;
        n = 0;
        while(digit1>0){
            n++;
            digit1/=10;
        }
        int res[] = new int[n];
        m = n-1;
        while(sum>0){
            res[m--] = sum%10;
            sum /= 10;
        }
        for(int i:res){
            System.out.println(res[i]);
        }
        return res;
        
    }
    public static void main(String[] args) {
        int nums1[]={4,2,3,5,6};
        int nums2[]={1,2,3,4,5};
        findArraySum(nums1,5,nums2,5);

        

    }
}