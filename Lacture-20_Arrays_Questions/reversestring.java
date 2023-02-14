public class reversestring {
    public static void reverse(char arr[]){
        int s=0,e=arr.length;
        while(s<=e){
            char temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e++;
        }
        System.out.print("------***After***------\n");
        
        for(int x=0;x<arr.length;x++){
            System.out.print(" "+arr[x]);
        }
    }
    public static void main(String[] args) {
        String str="iamnew";
        char[] arr=str.toCharArray();
        System.out.print("------***Before***------\n");
        for(int x=0;x<arr.length;x++){
            System.out.print(" "+arr[x]);
        }
        reverse(arr);
        
    }
}
