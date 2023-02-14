#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node* left;
    struct Node* right;
};
struct Node* create(int data){
    struct Node* newNode=(struct Node*)malloc(sizeof(struct Node));
    newNode->data=data;
    newNode->left=NULL;
    newNode->right=NULL;
    return newNode;
}
void inordertraversal(struct Node* temp){
    if(temp==NULL) return;
    inordertraversal(temp->left);
    printf("%d ",temp->data);
    inordertraversal(temp->right);
}
void preraversal(struct Node* temp){
    if(temp==NULL) return;
    printf("%d ",temp->data);
    inordertraversal(temp->left);
    inordertraversal(temp->right);
}
void postraversal(struct Node* temp){
    if(temp==NULL) return;
    inordertraversal(temp->left);
    inordertraversal(temp->right);
    printf("%d ",temp->data);
}
int main(){
    struct Node* root=create(1);
    root->left=create(2);
    root->right=create(3);
    root->left->left=create(4);
    root->left->right=create(5);
    root->right->left=create(6);
    root->right->right=create(7);
    printf("\nPreorder Traversing :");
    preraversal(root);
    printf("\nInorder Traversing :");
    inordertraversal(root);
    printf("\nPostorder Traversing :");
    postraversal(root);
}