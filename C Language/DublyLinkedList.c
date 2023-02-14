#include <stdio.h>
#include <stdlib.h>
struct Node{
	int data;
	struct Node* next;
    struct Node* prev;
};
struct Node* tail=NULL;//Last Node of List
struct Node* head=NULL;//stating Node root Node
void addfirst(int n){
	struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
	new_node->data=n;
	new_node->next=NULL;
    new_node->prev=NULL;
	if(head==NULL){
		head=tail=new_node;
		return;
	}
	new_node->next=head;
    head->prev=new_node;
	head=new_node;
	return;
}
void addLast(int n){
	struct Node* new_node= (struct Node*)malloc(sizeof(struct Node));
	struct Node* temp=head;
	new_node->data=n;
	new_node->next=NULL;
    new_node->prev=NULL;
	if(head==NULL){
		head=tail=new_node;
		return;
	}
	while(temp->next!=NULL){
		temp=temp->next;
	}
	temp->next=new_node;
    new_node->prev=temp;
    tail=new_node;
	return;
}
void deletefirst(){
	if(head==NULL){
		printf("Linked list allrady empty\n");
		return;
	}
	struct Node* n=head;
	head=head->next;
    head->prev=NULL;
	free(n);
}
void deleteLast(){
	if(head==NULL){
		printf("Linked list allrady empty\n");
		return;
	}
	struct Node* temp=head;
	while(temp->next->next!=NULL){
		temp=temp->next;
	}
    tail=temp;
	temp->next=NULL;
}
void print(struct Node* head){
	struct Node* temp=head;
	if(head=NULL){
		return;
	}
     printf("NULL<->");
	while(temp!=NULL){
		printf("%d<->",temp->data);
		temp=temp->next;
	}
	printf("NULL\n");
}
void printbackword(struct Node* tail){
	struct Node* temp=tail;
	if(tail=NULL){
		return;
	}
    printf("NULL<->");
	while(temp!=NULL){
		printf("%d<->",temp->data);
		temp=temp->prev;
	}
	printf("NULL\n");
}
int main(){
	addfirst(50);
	addLast(75);
	addfirst(25);
	addLast(100);
	addfirst(5);
	addLast(200);
	printf("Before deleting \n");
	print(head);
	deletefirst();
	deleteLast();
	// printf("%d",head->data);
	printf("after deleting \n");
	print(head);
    printf("PrintBackword\n");
    printbackword(tail);
    // printf("%d",tail->prev->data);
	return 0;
}