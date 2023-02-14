#include<iostream>
using namespace std;
int main(){
	string s="abcabcbb";
	int n=s.length();
	int curcnt=0;
	string sbstr="";
	int i=0,cnt=0;
	while(i<n){
		for(int j=0;j<sbstr.length();j++){
			if(sbstr[j]==s[i]) sbstr="";
			char ch=s[i];
			sbstr=sbstr+ch;
		}
		curcnt=sbstr.length();
		if(curcnt<cnt) cnt=curcnt;
		i++;
	}

	return cnt;
}
//output 3