package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearestSmallestToRight {
    public static ArrayList<Integer> solve(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stk.empty()&&arr[i]<arr[stk.peek()]){
                stk.pop();
            }
            if(stk.empty()){
                ans.add(-1);
            }else{ 
                ans.add(arr[stk.peek()]);
            }
            stk.push(i);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={4,5,2,10,8};
        System.out.println(solve(arr));
       
    }
}
