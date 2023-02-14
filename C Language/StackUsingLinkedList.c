#include<stdio.h>
#include<stdlib.h>
struct Node{
	int data;
	struct Node* next;
};
struct Node* head=NULL;//stating Node root Node
void push(int n){
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
int  pop(){
    struct Node* temp;
    int k;
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
int top(){
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

int main(){
    push(10);
    push(8);
    push(18);
    push(20);
    push(29);
    print(head);
    if(isEmpty()){
        printf("Not Empty\n");
    }else{
        printf("Empty\n");
    }
    printf("Pop: %d\n",pop());
   
    printf("top: %d\n",top());
    print(head);

}