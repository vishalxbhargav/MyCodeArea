#include <stdio.h>
#include <stdlib.h>
struct Node{
	int data;
	struct Node* next;
};
struct Node* head=NULL;//stating Node root Node
void addfirst(int n){
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
void addLast(int n){
	struct Node* new_node= (struct Node*)malloc(sizeof(struct Node));
	struct Node* temp=head;
	new_node->data=n;
	new_node->next=NULL;
	if(head==NULL){
		head=new_node;
		return;
	}
	while(temp->next!=NULL){
		temp=temp->next;
	}
	temp->next=new_node;
    temp->next=head;
	return;
}
void deletefirst(){
	if(head==NULL){
		printf("Linked list allrady empty\n");
	}
	struct Node* n=head;
	head=head->next;
	free(n);
}
void deleteLast(){
	if(head==NULL){
		printf("Linked list allrady empty\n");
	}
	struct Node* temp=head;
	while(temp->next->next!=NULL){
		temp=temp->next;
	}
	temp->next=head;
    

}
void print(struct Node* head){
	struct Node* temp=head;
	if(head=NULL){
		return;
	}
	while(temp!=head->next){
		printf("%d->",temp->data);
		temp=temp->next;
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
	printf("%d",head->data);
	printf("after deleting \n");
	print(head);
	return 0;
}