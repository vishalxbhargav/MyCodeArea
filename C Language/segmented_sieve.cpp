#include<iostream>
#include<vector>
using namespace std;
int sieve(int n){
    int cnt=0;
    vector<bool>inprime(n+1,true);
    for(long long i=2;i<=n;i++){
        if(inprime[i]){
            cout<<i<<endl;
            for(int j=2*i;j<n;j=j+i){
                inprime[j]=false;
            }
        }
    }
    return cnt;
}
void segsives(int l,int h){
    
}
int main(){
    int result= sieve(20);
    cout<<result;
    return 0;
}