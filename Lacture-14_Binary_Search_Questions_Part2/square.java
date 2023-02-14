public class square {
    public static int  squreroot(int x) {
        int start=0;
        int end=x;
        int mid=start+(end-start)/2;
        int ans=-1;
        while(start<=end){
            long sqrt=mid*mid;
            if(sqrt==x){
                return mid;
            }else if(sqrt>x){
                end=mid-1;
            }else{
                start=mid+1;
                ans=mid;
            }
            mid=start+(end-start)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int result=squreroot(38);
        System.out.println(result);

    }
    
}
