#include<iostream>
#include<math.h>
using namespace std;
int minimizehight(int arr[],int n,int k){
	int dif=arr[n-1]-arr[0];
	int min,max;
	for(int i=1;i<n;i++){
		if(arr[i]-k<0) continue;
		
		max=max(arr[i-1]+k,arr[n-1]-k);
		min=min(arr[0]+k,arr[i]-k);
		dif=min(dif,max-min);
	}
	return dif;
}
int main(){
	int arr[] = {3, 9, 12, 16, 20};
	cout<<minimizehight(arr,5,3);

	return 0;
}