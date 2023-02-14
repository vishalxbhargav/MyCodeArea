#include<iostream>
using namespace std;
bool anagram(string s,string p){
	if(s.length()!=p.length()) return false;
	int arr[26]={0};
	int number;
	char ch;
	for (int i = 0; i < s.length(); ++i)
	{
		ch=s[i];
		number=0;
		number=ch-'a';
		arr[number]++;
	}
	int number2;
	char ch2;
	for (int i = 0; i < p.length(); ++i)
	{
		ch2=p[i];
		number2=0;
		number2=ch2-'a';
		arr[number2]--;
	}
	for(int k=0;k<26;k++){
		if(arr[k]!=0) {
			return false;
		}
	}

	return true;
}
int main(){
	string s="anagram";
	string p="naramag";
	// cout<<anagram(s,p);
	if(anagram(s,p)){
		cout<<"anagram"<<endl;
	}else{
		cout<<"not anagram";
	}
	return 0;
}