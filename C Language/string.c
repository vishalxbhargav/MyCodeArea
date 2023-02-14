#include<stdio.h>
void uppercase(char string[]){
    int i,length=0;
    for(i=0;string[i]!='\0';i++){
        string[i]-=32;
        length++;
    }
    printf("Length of String is %d \n",length);
    printf("Converted String: %s\n",string);
}
void lowercase(char string[]){
    int i,length=0;
    for(i=0;string[i]!='\0';i++){
        string[i]+=32;
        length++;
    }
    printf("Converted String: %s",string);
}
/*void reversestring(char string[]){
    int s=0,e=13;
    while(s<=e){
            char temp=string[s];
            string[s]=string[e];
            string[e]=temp;
            s++;
            e++;
    }
    for (int i=0;string[i]!='\0';i++)
    {
        printf(" %c ",string[i]);
    }
    
}*/
int main(){
    char name[20];
    printf("Enter Your Name: ");
    scanf("%s",name);
    // printf("hello %s",name);
    uppercase(name);
    lowercase(name);
    // reversestring(name);
    // printf("%s",name);
    return 0;
}