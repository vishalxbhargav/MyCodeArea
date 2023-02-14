package Recursion;

import java.util.ArrayList;

public class JosephusProblemGameofDeathinaCircle {
    public static void gameofDeath(ArrayList<Integer> arr,int k,int index){
        if(arr.size()==1){
            System.out.println(arr.get(0));
            return;
        }
        index=(index+k)%arr.size();
        arr.remove(index);
        gameofDeath(arr, k, index);
    }
    public static void main(String[] args) {
        int n=40,k=7;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        k=k-1;
        int index=0;
        gameofDeath(arr,k,index);

    }
    
}
