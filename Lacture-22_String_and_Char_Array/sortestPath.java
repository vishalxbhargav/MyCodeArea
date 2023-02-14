public class sortestPath {
    public static int Path(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='w') x-=1;
            else if(s.charAt(i)=='e') x+=1;
            else if(s.charAt(i)=='n') y+=1;
            else y-=1;
        }
        return (int)Math.sqrt((y*y)+(x*x));
    }
    public static int main(String[] args) {
        String x="wneenessswennn";
        return Path(x);
    }
}
