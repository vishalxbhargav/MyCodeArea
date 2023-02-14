#include <stdio.h>
#define size 11
int main(){
	int firstlarg,secondlarg,i=0,nums[size]={1010,122,4,0,111,-25,13,20,12,88,500};
    if(nums[0]>nums[1]){
        firstlarg=nums[0];
        secondlarg=nums[1];
    } 
    else{
        firstlarg=nums[1];
        secondlarg=nums[0];
    }
    while(i<size){
        if(firstlarg<nums[i]){
            secondlarg=firstlarg;
            firstlarg=nums[i];
        } 
        if(secondlarg<nums[i]&&nums[i]<firstlarg)  secondlarg=nums[i];
        i++;
    }
    printf("First larg element=%d  Second large element=%d",firstlarg,secondlarg);

	return 0;
}