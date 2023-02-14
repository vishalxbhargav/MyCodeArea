package Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MaxAreaRectangleInBinaryMatrix {
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
        int  max=-1;
        for(int i=0;i<arr.length;i++){
            int cur=(left.get(i)-right.get(i)-1)*arr[i];
            max=Math.max(max,cur);
        }
        return max;
        
    }
    public static int solve(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int temp[]=new int[n];
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    temp[j]=0;
                }else{
                    temp[j]+=arr[i][j];
                }
            }
            result=Math.max(result,maximumArea(temp));
        }
            

        
        return result;
    }

    public static void main(String[] args){ 
        int arr[][]={{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        System.out.println(solve(arr));
    }
 }   
