import java.util.Scanner;

public class Findmaxinarray {
    public static int getMax(int nums[],int size){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public static int getMin(int nums[],int size){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int nums[]=new int [10000];
        System.out.println("Enter Size of Array");
        try (Scanner sc = new  Scanner(System.in)) {
            int size=sc.nextInt();
            System.out.println("Enter the Array");
            for(int i=0;i<size;i++){
                nums[i]=sc.nextInt();
            }
            System.out.println("the Max value is  " + getMax(nums, size));
            System.out.println("the Min value is  " + getMin(nums, size));
        }
        
        

    }
}
