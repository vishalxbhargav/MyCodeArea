#include<stdio.h>
#include<string.h>
#define Max 100
char arr[Max];
static int i=0;
char ch;
void push(char n){
	arr[i++]=n;
}
char pop(){
	char n=arr[i-1];
	arr[i-1]=0;
	i--;
	if(i<0){
		return -1;
	}
	return n;
}
char top(){
	return arr[i-1];
}
int isEmpty(){
    if(i<=0) return 1;
    return 0;
}
int prec(char ch){
	if(ch=='^') return 3;
	else if(ch=='*'||ch=='/') return 2;
	else if(ch=='+'||ch=='-') return 1;
	else return -1;
}
void convert(char str[]){
	static int k=0;
	char result[strlen(str)];
	for(int i=0;i<strlen(str);i++){
		char ch=str[i];
		if(ch>='a'&&ch<='z'){
			result[k++]=ch;
		}else if(ch=='('){
			push(ch);
		}else if(ch==')'){
			while(!isEmpty()&&top()!='('){
				result[k++]=pop();
			}
			if(!isEmpty()) pop();
		}else{
			while(!isEmpty()&&prec(top())>prec(ch)){
				result[k++]=pop();
			}
			push(ch);
		}
	}
	while (!isEmpty())
	{
		result[k++]=pop();
	}
	printf("%s",result);
	return;
}
int main(){
	char str[]="(a+b/c)*(a/k-l)";
    // char str[]="a+b*c";
	convert(str);
    // if(isEmpty()){
    //     printf("stack is empty\n");
    // }else{
    //     printf("stack is not empty\n");
    // }
	printf("%c",top());
}