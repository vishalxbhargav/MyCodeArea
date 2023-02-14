#include<iostream>
using namespace std;
void solve(int open, int close, string output) {
        if(open==0&&close==0){
            cout<<output<<endl;
            return;
        }
        if(open!=0){
            string op1=output;
            op1=op1+"(";
            solve(open-1, close, op1);
        }
        if(open<close){
            string op2=output;
            op2=op2+")";
            solve(open, close-1, op2);
        }
        return ;
    }
int main(){
	string st="";
	int n=3;
	cout<<st;
	solve(n,n,st);

	
}
