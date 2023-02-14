#include<iostream>
using namespace std;
void reverse(int arr[]){

}
int main(){
	int nums[]={0,1,0,3,12,};
	int nonZero=0;
	for(int i=0;i<5;i++){
		if(nums[i]!=0){
			swap(nums[i],nums[nonZero]);
			nonZero++;
		}
	}
	for(int i=0;i<5;i++){
		cout<<" "<<nums[i];
	}
	return 0;
}