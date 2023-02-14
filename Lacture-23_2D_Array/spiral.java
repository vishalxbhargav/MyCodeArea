public class spiral {
    public static void spiralOrder(int[][] matrix) {
       
        int row = matrix.length;
        int col = matrix[0].length;

        int total = row * col;
        int count = 0;

        int al[]=new int[total];


        // initialise the indexes;
        int startRow = 0;
        int endCol = col - 1;
        int endRow = row - 1;
        int startCol = 0;

        while(count < total){

            //print startRow
            for(int idx = startCol; count < total && idx <= endCol; idx++){
                al[count]=matrix[startRow][idx];
                count++;
            }
            startRow++;

            // print lastCol
            for(int idx = startRow; count < total && idx <= endRow; idx++){
                al[count]=matrix[idx][endCol];
                count++;
            }
            endCol--;

            // print lastRow

            for(int idx = endCol; count < total && idx >= startCol; idx--){
                al[count]=matrix[endRow][idx];
                count++;
            }
            endRow--;

            // print firstCol

            for(int idx = endRow; count < total && idx >= startRow; idx--){
                al[count]=matrix[idx][startCol];
                count++;
            }
            startCol++;
        }
        //print sprial array
        for(int i=0;i<total;i++){
            System.out.print(" "+al[i]);
        }

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(arr);
    }
}
