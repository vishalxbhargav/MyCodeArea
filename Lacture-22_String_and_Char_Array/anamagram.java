public class anamagram {
    public static boolean funforanagram(String s,String p){
        if(s.length()!=p.length()) return false;
        int arr[]=new int [26];
        int n;
        char ch;
        for(int i=0;i<s.length();i++){
            n=0;
            ch=s.charAt(i);
            n=ch-'a';
            arr[n]++;
        }
        for(int i=0;i<s.length();i++){
            n=0;
            ch=p.charAt(i);
            n=ch-'a';
            arr[n]--;
        }
        for(int j:arr){
            if(arr[j]!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String p="nagamar";
        boolean result=funforanagram(s, p);
        System.out.println(result);
    }
}
