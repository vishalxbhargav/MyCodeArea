#include<stdio.h>
void countoddeven(int nums[],int n){
    int i,count=0;
    for (i = 0; i < n; i++){
        if(nums[i]%2==0) count++;
    }
    printf("Total Even number in array is: %d\n",count);
    printf("Total Odd number in array is: %d\n",n-count);
}
void arraychangeto2darray(int arr[],int n){
    int row,col,i,j,cout=0;
    printf("Enter The nuber row and column: \n");
    scanf("%d",&row);
    scanf("%d",&col);
    int array[row][col];
    for (i = 0; i < row; i++){
        for (j = 0; j < col; j++){
            array[i][j]=arr[cout];
            cout++;
        }
    }
    printf("Converted 2d Array:- \n");
    for (i = 0; i < row; i++){
        for (j = 0; j < col; j++){
            printf(" %d",array[i][j]);
        }
        printf("\n");
    }   
}

int main(){
    int arr[]={11,12,5,6,66,4,5,88,8,77,77,8,45,54,88,64,5,4};
    int i,arrlength=18;
    printf("Input Array:-");
    for (i = 0; i < arrlength; i++){
        printf(" %d",arr[i]);
    }
    printf("\n");
    countoddeven(arr,arrlength);
    arraychangeto2darray(arr,arrlength);
    return 0;
    
}