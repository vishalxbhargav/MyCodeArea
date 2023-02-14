#include<stdio.h>
int main(){
  int arr[10];
  arr[0]=20;
  arr[1]=30;
  arr[2]=40;
  arr[3]=50;
  arr[4]=60;
  arr[5]=70;
  int n=0;
  printf("%d",sizeof(arr)/sizeof(arr[0]));

}