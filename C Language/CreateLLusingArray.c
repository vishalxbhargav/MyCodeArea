#include <stdio.h>
#include <stdlib.h>
struct Node{
	int data;
	struct Node* next;
};
struct Node* Create(int arr[],int n){
    if(n==-1) return NULL;
    static int k=0;
    struct Node* head=NULL;
	head= (struct Node*)malloc(sizeof(struct Node));
	head->data=arr[k++];
	head->next=Create(arr,n-1);
	return head;
}
void print(struct Node* head){
    struct Node* temp=head;
    while (temp->next!=NULL){
        printf("%d->",temp->data);
        temp=temp->next;
    }
    printf("NULL");
}
int main(){
    int i,n=7,arr[100]={10,20,30,40,50,60,70};
    struct Node* temp;
    printf("Entern array n: ");
    for(i=0;i<n;i++){
       printf("%d ",arr[i]);
    }
    printf("\n");
    temp=Create(arr,n);
    printf("Linked List Element\n");
    print(temp);
}