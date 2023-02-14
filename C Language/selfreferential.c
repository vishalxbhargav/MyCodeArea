#include <stdio.h>
struct ref{
    int data;
    float val;
    struct ref* link;
 };
 int main()
 {
    struct ref object1;  //link1
    object1.link = NULL;
    object1.data = 10;
    object1.val = 20;
    
    struct ref object2; //

    object2.link = NULL;
    object2.data = 30;
    object2.val = 40;
    object1.link = &object2;
    printf("%d\n",object1.link->data);
    printf("%f\n",object1.link->val);

    return 0;
 }