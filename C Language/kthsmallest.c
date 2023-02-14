/*Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.


Example 2:

Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given 
array is 15.
*/
#include<stdio.h>
int kthsmallest(int arr[],int n,int k){
    for (int i = 0; i < n; i++){
        int flag=0;
        for(int j=0;j<n;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=1;
            }
            if(flag==0) break; 
        }   
    }
    printf("Kth Smallest element is: %d",arr[k]);
    
}
int main(){
    int k, nums[]={4,2,7,13,33,19,20,11,37};
    int nums2[]={7,10,4,20,15};
    printf("Enter the value of K: ");
    scanf("%d",&k);
    kthsmallest(nums2,9,k);
    return 0;
}