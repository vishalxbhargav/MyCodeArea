import java.util.HashSet;
import java.util.Set;

public class substringwithoutrepeating {
    public static int substring(String s){
      int left=0,right=0,max=0;
      Set<Character> seen=new HashSet<>();
      while(right<s.length()){
        if(seen.add(s.charAt(right))){
            max=Math.max(max,right-left+1);
            right++;
        }else{
            while(s.charAt(left)!=s.charAt(right)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.remove(s.charAt(right));
            left++;
        }
      }

	return max;
    }
    public static void main(String[] args) {
        String s="abckabcbb";
        System.out.println(substring(s));
    }
}
