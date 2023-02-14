#include<iostream>
#include<vector>
using  namespace std;
int main(){
	vector<int> nums();
	nums.push_back(1);
	nums.push_back(2);
	nums.push_back(3);
	nums.push_back(4);
	nums.push_back(5);
	nums.push_back(6);
	nums.push_back(7);
	nums.push_back(8);

	vector<int> temp(nums.size());
	for(int i=0;i<nums.size();i++){
		temp[(i+k)%n]=nums[i];
	}
	nums=temp;
	for(int i:nums){
		cout<<" "<<nums[i]<<endl;
	}
}