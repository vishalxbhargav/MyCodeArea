public class completeSquareroot {
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
    public static double morePricision(int x,int precision,int tempsolu){
        double factor=1;
        double ans=tempsolu;
        for(int i=0;i<precision;i++){
            factor=factor/10;
            for(double j=ans;j*j<x;j=j+factor){
                ans=j;

            }
        }
        return ans;


        
    }
    public static void main(String[] args) {
      int tempsolu=squreroot(37);
      double result=morePricision(37,3,tempsolu);
      System.out.println(result);

    }
}
