#include<iostream>
#include<stack>
#include <vector>
using namespace std;
void histogram(int arr[],int n){
	stack<int> stk;
	stack<int> stk1;
	vector<int> v;
	vector<int> v2;
	//smaller to right
	for(int i=n-1;i>=0;i--){
		while(!stk.empty()&&arr[i]<arr[stk.top()]){
			stk.pop();
		}
		if(stk.empty()) v.push_back(1);
		else v.push_back(stk.top()-i);
		stk.push(i);
	}
	for(int i=0;i<n;i++){
		cout<<v.at(i)<<" ";


	}
	cout<<endl;
	//Smaller to left
	for(int i=0;i<n;i++){
		while(!stk1.empty()&&arr[i]<arr[stk1.top()]){
			stk1.pop();
		}
		if(stk1.empty()) v2.push_back(1);
		else v2.push_back(i-stk1.top());
		stk1.push(i);
	}

	for(int i=0;i<n;i++){
		cout<<v2.at(i)<<" ";


	}
}
int main(){
	int arr[]={2,3,3,2};int n=4;
	
	int aarr[]={6,2,5,4,5,1,6};
    int nums1[]={0,1,1,0};
    int nums2[]={1,2,2,1};
    int nums3[]={2,3,3,2};
    int nums4[]={3,4,0,0};
    histogram(nums4,n);
	
	
}