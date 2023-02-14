#include<stdio.h>
int main(){
    char a,b;
    int i,j;
    printf("Enter LowerCase Alphabet: ");
    scanf("%c",&a);
    a-=32;
    printf("%c",a);
    for (i = 65; i < a; i++)
    {
        printf("%c",a+i);

    }
    
    return 0;
}