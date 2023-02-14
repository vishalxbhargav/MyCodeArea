#include<iostream>
using namespace std;
int main(){
	int nums[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};
	int index=0;
	for(int i=0;i<9;i++){
		if(nums[i]>0){
			swap(nums[i],nums[index]);
			index++;
		}
	}
	for(int i=0;i<9;i++){
		cout<<nums[i]<<endl;
	}
	return 0;
}