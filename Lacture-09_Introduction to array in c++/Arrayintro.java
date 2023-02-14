import java.util.Scanner;

public class Arrayintro {//function with parameter for print Array
    public static void printArray(int nums[],int size){
        System.out.println("The Output is Here");
        for (int i=0; i<nums.length; i++)   
        {  
        System.out.print(nums[i]+" ");  
        }  
    }
    public static void main(String[] args) {
        try (//Array is Similar data type variable ,who contains continues memory allocation
        Scanner input = new Scanner(System.in)) {
            int i;
            //Initialize Array
            int nums[]= new int[10];
            
            System.out.println("Input is Here:");
            for(i=0;i<nums.length;i++){
                nums[i]=input.nextInt();
            }
            printArray(nums,nums.length);
            input.close();
        }
    }
        
}