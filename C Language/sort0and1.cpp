#include<iostream>
using namespace std;
int main(){
	int nonzero=0;
	int nums[]={1,1,0,1,1,0,0,1,0,0,1,1};
	for (int i = 0; i < 12; ++i)
	{
		if(nums[i]!=1){
                swap(nums[nonzero], nums[i]);
                nonzero++;
            }
	}
	for(int i=0;i<12;i++){
		cout<<" "<<nums[i];
	}
	return 0;
}