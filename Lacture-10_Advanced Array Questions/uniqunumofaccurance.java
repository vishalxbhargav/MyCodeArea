import java.util.HashMap;
import java.util.HashSet;

public class  uniqunumofaccurance {
    public static boolean unique(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();//Need to understand
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i:map.keySet()){
            if(!set.add(map.get(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,1,1,3};
        boolean result =unique(nums);
        System.out.println(result);
        
    }
}
