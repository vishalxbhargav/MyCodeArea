public class bublesort {
    public static void sorting(int nums[]){
        
        for(int i=0;i<nums.length;i++){
            boolean swap=false;
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                    swap=true;
    
                }
                if(swap==false) break;
                
            }
            
            
        } 
    }
    public static void main(String[] args) {
        
    int numb[]={1,3,4,6,7,8,9,15};
    int nums[] = { 1, 5, 8, 2, 9, 3, 1, 45, 10, 6 };
    sorting(nums);
    sorting(numb);
    for(int i=0;i<nums.length;i++){
        System.out.print(" "+nums[i]);
    }
    System.out.println("----------New Line----------");
    for(int i=0;i<nums.length;i++){
        System.out.print(" "+numb[i]);
    }
}
}
