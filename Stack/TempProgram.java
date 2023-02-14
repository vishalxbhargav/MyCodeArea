package Stack;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Stack;

public class TempProgram {
    public static int maximumArea(int arr[]){
        //Greater to Leftt {6,2,5,4,5,1,6};
        ArrayList<Integer> left=new ArrayList<>();
        ArrayList<Integer> right=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            while(!stk.empty()&&arr[i]<arr[stk.peek()]){
                stk.pop();
            }
            if(stk.empty())right.add(1);
            else right.add(stk.peek()-i);
            stk.push(i);
        }
        Collections.reverse(right);
        System.out.println(right);
        stk =new Stack<>();
        for(int i=0;i<n;i++){
            while(!stk.empty()&&arr[i]<arr[stk.peek()]){
                stk.pop();
            }
            if(stk.empty()) left.add(1);
            else left.add(i-stk.peek());
            stk.push(i);
        }
    
        System.out.println(left);
        int  max=-1;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i]*(right.get(i)+left.get(i)-1);
            max=Math.max(max,temp);
        }
        return max;

    }
    public static int largestRectangleArea(int[] a) {
        int max=0;
        int ps[]=prevSmallest(a);
        int ns[]=nextSmallest(a);
        for(int i=0;i<a.length;i++){
            int cur=(ns[i]-ps[i]-1)*a[i];
            max=Math.max(max,cur);
        }
        return max;
        
    }
    public static int[] prevSmallest(int[]a){
        int ps[]=new int[a.length];
        Deque<Integer> s=new ArrayDeque<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<ps.length;i++) System.out.print(" "+ps[i]);
        System.out.println();
        return ps;
    }
    public static int[] nextSmallest(int[]a){
        int ns[]=new int[a.length];
        Deque<Integer> s=new ArrayDeque<>();
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i]=a.length;
            }else{
                ns[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<ns.length;i++) System.out.print(" "+ns[i]);
        System.out.println();
        return ns;
    }
    public static void main(String[] args) {
        // int aarr[]={6,2,5,4,5,1,6};
        // // int aarr[]={2,1,5,6,2,3};
        int nums1[]={0,1,1,0};
        int nums2[]={1,2,2,1};
        int nums3[]={2,3,3,2};
        int nums4[]={3,4,0,0};
        System.out.println(largestRectangleArea(nums1));
        System.out.println(largestRectangleArea(nums2));
        System.out.println(largestRectangleArea(nums3));
        System.out.println(largestRectangleArea(nums4));
        // maximumArea(nums4);

    }
}
