package Stack;
import java.util.Stack;
import java.util.ArrayList;

public class StockSpanProblem {
    public static ArrayList<Integer> solve(int[]arr){
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        for(int i=0; i<arr.length;i++){
            while(!stk.isEmpty()&&arr[i]>arr[stk.peek()]){
                stk.pop();
            }
            if(stk.isEmpty()) ans.add(1);
            else   ans.add(i-stk.peek());
            stk.push(i);
        }
        // Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        // int arrr[]={1,3,2,4};
        int arr[]={100,80,60,70,60,75,85};
        System.out.println(solve(arr));
    }
}
