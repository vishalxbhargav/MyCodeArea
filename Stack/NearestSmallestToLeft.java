package Stack;

import java.util.ArrayList;
import java.util.Stack;
public class NearestSmallestToLeft {
    public static ArrayList<Integer> solve(int arr[]){
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        for(int i=0; i<arr.length;i++){
            while(!stk.isEmpty()&&arr[i]<stk.peek()) stk.pop();
            if(stk.isEmpty())  ans.add(-1);
            else  ans.add(arr[stk.peek()]);
            stk.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={4,5,2,10,8};
        System.out.println(solve(arr));
    }
}
