import java.util.Scanner;

public class linearsearch {
    public static boolean search(int nums[],int size,int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key) return true;
        }
        return false;
    }
    public static void  main(String[] args) {
        int nums[]={5,7,-2,10,22,-2,8,5,22,1};
        System.out.print("Enter Key =  ");
        try (Scanner sc = new Scanner(System.in)) {
            int key= sc.nextInt();

            boolean found=search(nums, nums.length, key);
            if(found){
                System.out.println("Key is Present");
            }else{
                System.out.println("Key is not Present");
            }
        }
        

        
    }
}
