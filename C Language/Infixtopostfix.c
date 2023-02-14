#include<stdio.h>
#include<string.h>
#include<stdint.h>
void conversion(char str[]){
    for(int i=0;i<strlen(str);i++){
        printf("%c ",str[i]);
    }
}
int main(){
    int k=0;
    char str[20]="(a+b/c)*(a/k-l)";
    char ch=str[0];
    char result[100];
    result[k++]=ch;
    int l=0; 
    l=strlen(str);
    printf("%d",l);
    conversion(str);
    printf("\n");
    printf("%s",result);
}