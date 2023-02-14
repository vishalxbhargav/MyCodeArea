class test {
    static int Max=10;
    static int arr[]=new int[Max];
    static int peek=Max-1;
    public static void push(int n){
        if(peek<0){
            System.out.println("stack is full");
            return;
        }
        arr[peek--]=n;
    }
    public static int pop(){
        if(peek==Max-1){
            System.out.println("stack is empty");
            return -1;
        }
        int n=arr[peek++];
        return n;
    }
    public static int top(){
        return arr[peek];
    }
    public static int isEmpty(){
        if(peek==Max-1){
            return 1;
        }
        return 0;
    }
    public static void main(String args[]){
        push(10);
        push(20);
        push(30);
        System.out.println(pop());
        for(int i:arr){
            System.out.println(arr[i]+" ");
        }
    }
}