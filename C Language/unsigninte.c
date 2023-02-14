#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct Node{
	char data;
	struct Node* next;
};
struct Node* head=NULL;//stating Node root Node
void push(char n){
	struct Node* new_node= (struct Node*)malloc(sizeof(struct Node));
	new_node->data=n;
	new_node->next=NULL;
	if(head==NULL){
		head=new_node;
		return;
	}
	new_node->next=head;
	head=new_node;
	return;
}
char pop(){
    struct Node* temp;
    char k;
    if(head==NULL){
        printf("Underflow");
        return -1;
    }
    temp=head;
    k=temp->data;
    head=head->next;
    free(temp);
    return k;
}
char top(){
    if(head==NULL){
        printf("Stack is empty\n");
        return -1;
    }
    return head->data;
}
int isEmpty(){
    if(head==NULL) return 0;
    return 1;
}
void print(struct Node* head){
	struct Node* temp=head;
    printf("\n");
	if(head=NULL){
		return;
	}
	while(temp!=NULL){
		printf("%d->",temp->data);
		temp=temp->next;
	}
	printf("NULL\n");
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
	push('k');
	printf("%c",top());
	// convert(str);
}