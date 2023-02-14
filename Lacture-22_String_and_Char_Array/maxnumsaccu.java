public class maxnumsaccu {
    public static char getMax(String str){
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        int number=0;
        number=ch-'a';
        arr[number]++;
        }
        int max=-1,ans=0;
        for(int i=0;i<26;i++){
            if(max<arr[i]){
                ans=i;
                max=arr[i];
            }
        }
        char finalAns=(char) ('a'+ans);
        return finalAns;

    }
    public static void main(String[] args) {
        char result=getMax("test");
        System.out.println(result);
    }
}
