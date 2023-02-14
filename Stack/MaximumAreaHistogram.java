package Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MaximumAreaHistogram {
    public static int maximumArea(int arr[]){
        //Greater to Leftt {6,2,5,4,5,1,6};
        ArrayList<Integer> left=new ArrayList<>();
        ArrayList<Integer> right=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        //preveiws smaller
        for(int i=0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                right.add(-1);
            }else{
                right.add(stk.peek());
            }
            stk.push(i);
        }
        System.out.println(right);
        //next smaller
        for(int i=arr.length-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                left.add(arr.length);
            }else{
                left.add(stk.peek());
            }
            stk.push(i);
        }
        Collections.reverse(left);
        System.out.println(left);
        int  max=-1;
        for(int i=0;i<arr.length;i++){
            int cur=(left.get(i)-right.get(i)-1)*arr[i];
            max=Math.max(max,cur);
        }
        return max;
        
    }
    public static void main(String[] args) {
        int aarr[]={6,2,5,4,5,1,6};
        // int aarr[]={2,1,5,6,2,3};
        int nums1[]={0,1,1,0};
        int nums2[]={1,2,2,1};
        int nums3[]={2,3,3,2};
        int nums4[]={3,4,0,0};
        System.out.println(maximumArea(nums1));
        System.out.println(maximumArea(nums2));
        System.out.println(maximumArea(nums3));
        System.out.println(maximumArea(nums4));
        System.out.println(maximumArea(aarr));

    }
}
