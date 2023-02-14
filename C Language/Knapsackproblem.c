#include<stdio.h>
int solve(int arr[],int n){
	int sum=0;
	int temp=0;
	for(int i=0;i<n;i++){
		sum+=arr[i];
	}
	for(int i=0;i<n;i++){
		temp+=arr[i];
		if(temp>sum-temp){
			temp-arr[i];
		}
		if(temp==sum-temp) return 0;
	}
	return 1;
}
int main(){
	int arr[]={1,5,11,5};
	int n=(sizeof(arr)/sizeof(arr[0]));
	if(solve(arr,n)){
		printf("true");
	}else{
		printf("false");
	}
}