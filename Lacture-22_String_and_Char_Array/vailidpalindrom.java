public class vailidpalindrom {
    public static char toLowercase(char str){
        if(str >='a'&& str <='z'){
            return str;
        }else{
            char temp= (char) (str-'A'+'a');
            return temp;
        }
    }
    public static boolean palindrom(String str){
        char[] arr = str.toCharArray();
        int s=0,e=arr.length-1;
        while(s<=e){
            if(toLowercase(arr[s])!=(toLowercase(arr[e]))){
                return false;
            }else{
                s++;
                e--;
            }

        }
        return true;
        
    }
    public static void main(String[] args) {
        String str="adda";
        if(palindrom(str)){
            System.out.println("the given string is valid palindrome");
        }else{
            System.out.println("the given string is't valid palindrome");
        }
    }
}
