#include<iostream>
using namespace std;
int main(){
	string s="abcabcbb";
	int n=s.length();
        int curcnt=0;
        String sbstr="";
        int i=0,cnt=0;
        while(i<n){
            for(int j=0;j<sbstr.length();j++){
                if(sbstr[i]==s[i+j]) sbstr="";
                
            }
            char ch=s[i];
            sbstr=sbstr+ch;
            curcnt=sbstr.length();
            if(curcnt>cnt) cnt=curcnt;
            i++;
        }

	return cnt;
}