#include<iostream>
using namespace std;
int solve(int n,int k){
    if(n==1&&k==1) return 0;
    int  mid =(2<<n-1)/2;
    if(k<=mid){
        return solve(n-1,k);
    }else{
        return !solve(n,k-mid);
    }
}
int main(){
    cout<<solve(2,2);
}