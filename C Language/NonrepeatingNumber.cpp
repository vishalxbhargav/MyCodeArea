#include<stdio.h>
int check(int n){
	if(n&(n-1)==0)	return 1;
	else return 0;
}
int main(){

	printf("%b\n",7);
	printf("%b\n",8);
	printf("%b\n",7&8);
	check(81);
	return 0;
}