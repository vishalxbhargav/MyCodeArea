//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

/*
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
#include<stdio.h>
int removeelement(int nums[],int n,int target){
    int validsize=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=target){ 
                nums[validsize]=nums[i];
                validsize++;
            }
        }
        return validsize;
}
int main(){
    int nums[100]={1,2,9,3,3,0,2,4,3,7,8,9,2};
    int result=removeelement(nums,13,3);
    printf("after remove target size of Array :%d\n",result);
    for (int i = 0; i < result; i++)
    {
        printf(" %d",nums[i]);
    }
    return 0;
}
/*
Output of Above code:- after remove target size of Array :10
                    Array=1 2 9 0 2 4 7 8 9 2
*/