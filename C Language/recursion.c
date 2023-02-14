#include<stdio.h>
void printincrese(int n){
	if(n==1){
		printf("%d\n",n);
		return;
	}
	printincrese(n-1);
	printf("%d\n",n);

}
void printdecre(int n){
	if(n==1){
		printf("%d\n",n);
		return;
	}
	printf("%d\n",n);
	printdecre(n-1);
	

}
int main(){
	// printdecre(10);
	// printf("----------\n");
	// printincrese(10);
	// FILE *fptr;
	// fptr=fopen("example.txt","r");
	// char ch;
	// fscanf(fptr,"%c",&ch);
	// printf("%c",ch);
	// fclose(fptr);
	int arr[]={5, 3, 8, 1, 4, 6, 2, 7};
	int n=(sizeof(arr)/sizeof(arr[0]));
	printf("%d",n);
}