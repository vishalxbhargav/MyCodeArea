#include<stdio.h>
void arrprop(int arr[],int x){
	arr[2]=4;
	x=20;
}
int main(){
	int x=10;
	int a[3]={1,3,3};
	printf("before call function\n");
	//integer value
	printf("%d\n",x);

	//array value
	printf("%d\n",a[0]);
	printf("%d\n",a[1]);
	printf("%d\n",a[2]);
	arrprop(a,x);
	printf("after call function\n");

	//integer value not change
	printf("%d\n",x);

	//array value change?
	printf("%d\n",a[0]);
	printf("%d\n",a[1]);
	printf("%d\n",a[2]);
}
