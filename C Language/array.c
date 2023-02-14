#include <stdio.h>
#define size 5
int main()
{
	int nums[size],i,sum=0;
	printf("Enter %d size array element:\n",size);
	for (i = 0; i < size; i++){
		scanf("%d",&nums[i]);
	}
	for (i = 0; i < size; i++){
		printf("index number %d -: element %d\n",i,nums[i]);
		sum+=nums[i];
	}


	printf("The Sum of Array is :-%d\n",sum);
	printf("Average Of Array's element :-%lf",(double)sum/size);

	return 0;
}