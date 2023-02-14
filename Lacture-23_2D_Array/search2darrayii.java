public class search2darrayii {
    public static boolean search(int arr[][],int target){
        int row=arr.length;
        int col=arr[0].length;

        int rowindex=0;
        int colindex=col-1;
        while(colindex>=0&&rowindex<row){
            int element=arr[rowindex][colindex];

            if(element==target) return true;

            if(element<target){
                rowindex++;
            }else{
                colindex--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[][]={{1,4,7,11,15},{2,3,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean result=search(nums, 210);
        if(result){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not Found");
        }
    }
}

/*
 1, 4, 7, 11,15
 2, 3, 8, 12,19
 3, 6, 9, 16,22
 10,13,14,17,24
 18,21,23,26,30
 */