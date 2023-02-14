public class nextPermutation{
public static void Permutation(int[] num) {
    int n=num.length;
    if(n<2)
        return;
    int index=n-1;        
    while(index>0){
        if(num[index-1]<num[index])
            break;
        index--;
    }
    if(index==0){
        reverseSort(num,0,n-1);
        return;
    }
    else{
        int val=num[index-1];
        int j=n-1;
        while(j>=index){
            if(num[j]>val)
                break;
            j--;
        }
        swap(num,j,index-1);
        reverseSort(num,index,n-1);
        return;
    }
}

public static void swap(int[] num, int i, int j){
    int temp=0;
    temp=num[i];
    num[i]=num[j];
    num[j]=temp;
}

public static void reverseSort(int[] num, int start, int end){   
    if(start>end)
        return;
    for(int i=start;i<=(end+start)/2;i++)
        swap(num,i,start+end-i);
}
public static void main(String[] args) {
    int nums[]={4,2,3,1};
    Permutation(nums);
    System.out.print(" "+nums[0]);
    for(int i:nums){
        System.out.print(" "+nums[i]);
    }
}
}
