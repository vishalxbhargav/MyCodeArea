#include<iostream>
using namespace std;
int  nonrepeating(int arr[],int n){
	int xorSum=0;
	for (int i = 0; i < n; ++i){
		xorSum^=arr[i];
		
	}
	printf("%b\n",xorSum);
	int setbit=(xorSum & ~(xorSum-1));
	printf("%b\n",setbit);
	int first=0,second=0;
	for (int i = 0; i < n; ++i)
	{
		if(arr[i]&setbit!=0)
			first^=arr[i];
		else
			second^=arr[i];
	}
	cout<<first<<endl<<second<<endl;
	return 0;
}
int main(){
	int nums[]={2,1,2,3};
	int result=nonrepeating(nums,6);
	cout<<result;
	return 0;
}