#include<stdio.h>
int revesebit(int n){
	int result = 0;
    int mask = 1;
    for (int i = 0; i < 32; i ++) {
        int digit = n & mask;
        result = (result << 1);
        if (digit != 0) {
             result = result + 1;
        }
        mask = (mask << 1);
    }
    // printf("%b",result);
    return result; 
}
int main(){
	// int n = 00000010100101000001111010011100;
	int n=43261596;
	revesebit(n);
	printf("%d\n",revesebit(n));
}