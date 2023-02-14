#include<iostream>
using namespace std;
int slidingwindow(string s){
	int cont=0,left=0,right=2;
	while(left<=s.length()-4){
		right=left+2;
		for (int i = right; i < s.length; ++i)
		{

		}
	}
}
int main(){
	string s="abcabc";
	cout<<slidingwindow(s);
	
}